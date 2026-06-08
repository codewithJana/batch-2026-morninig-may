import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

// --- 1. DOMAIN MODELS (Using Modern Java Records) ---
enum OrderStatus { PENDING, PROCESSED, FAILED }
enum ProductType { ELECTRONICS, CLOTHING, BOOKS, HOME }

record Order(int orderId, String customerName, ProductType productType, double price, OrderStatus status) {
    // Wither method to change status (since records are immutable)
    public Order withStatus(OrderStatus newStatus) {
        return new Order(this.orderId, this.customerName, this.productType, this.price, newStatus);
    }
}

// --- 2. CUSTOM EXCEPTION ---
class OrderProcessingException extends Exception {
    public OrderProcessingException(String message) {
        super(message);
    }
}

// --- 3. MAIN SIMULATOR CLASS ---


public class OrderSystemSimulator {

    // Thread-safe tracking variables
    private static final BlockingQueue<Order> orderQueue = new LinkedBlockingQueue<>();
    private static final List<Order> completedOrders = new CopyOnWriteArrayList<>();
    private static final AtomicInteger idGenerator = new AtomicInteger(1000);

    public static void main(String[] args) {
        System.out.println("=== STARTING COMPLEX ORDER SYSTEM SIMULATION ===\n");

        int producerThreads = 2;
        int consumerThreads = 3;

        ExecutorService producerService = Executors.newFixedThreadPool(producerThreads);
        ExecutorService consumerService = Executors.newFixedThreadPool(consumerThreads);

        // Submit Producers (Generating Orders)
        for (int i = 0; i < producerThreads; i++) {
            producerService.submit(new OrderProducer("Producer-" + (i + 1), 10));
        }

        // Submit Consumers (Processing Orders)
        for (int i = 0; i < consumerThreads; i++) {
            consumerService.submit(new OrderProcessor("Processor-" + (i + 1)));
        }

        // Shutdown producers after they finish generating
        producerService.shutdown();
        try {
            if (producerService.awaitTermination(10, TimeUnit.SECONDS)) {
                System.out.println("\n[SYSTEM] All producers finished generating orders.");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Wait a bit for consumers to drain the queue, then shut them down
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        consumerService.shutdownNow();
        System.out.println("[SYSTEM] Processing complete. Shutting down worker threads.\n");

        // Display Complex Metrics using Streams
        generateReport();
    }

    // --- 4. PRODUCER (Generates Orders) ---
    static class OrderProducer implements Runnable {
        private final String name;
        private final int totalOrders;
        private final Random random = new Random();
        private final String[] customers = {"Alice", "Bob", "Charlie", "Diana", "Evan"};

        public OrderProducer(String name, int totalOrders) {
            this.name = name;
            this.totalOrders = totalOrders;
        }

        @Override
        public void run() {
            for (int i = 0; i < totalOrders; i++) {
                try {
                    Thread.sleep(random.nextInt(300)); // Simulate time between orders

                    int id = idGenerator.incrementAndGet();
                    String customer = customers[random.nextInt(customers.length)];
                    ProductType type = ProductType.values()[random.nextInt(ProductType.values().length)];
                    double price = 10.0 + (500.0 - 10.0) * random.nextDouble();

                    Order order = new Order(id, customer, type, price, OrderStatus.PENDING);
                    orderQueue.put(order);

                    System.out.printf("[%s] Created Order #%d for %s (%s - $%.2f)\n",
                            name, id, customer, type, price);

                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
    }

    // --- 5. CONSUMER (Processes Orders) ---
    static class OrderProcessor implements Runnable {
        private final String name;
        private final Random random = new Random();

        public OrderProcessor(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    // Take order from queue (blocks if empty)
                    Order order = orderQueue.poll(800, TimeUnit.MILLISECONDS);

                    if (order == null) break; // Exit if no orders arrive within timeout

                    System.out.printf("   --> [%s] Picked up Order #%d\n", name, order.orderId());
                    Thread.sleep(random.nextInt(600)); // Simulate processing work

                    try {
                        // 15% chance order processing fails randomly (e.g., payment declined)
                        if (random.nextInt(100) < 15) {
                            throw new OrderProcessingException("Payment Gateway Timeout");
                        }

                        completedOrders.add(order.withStatus(OrderStatus.PROCESSED));
                        System.out.printf("       ✓ [%s] SUCCESS: Order #%d Processed.\n", name, order.orderId());

                    } catch (OrderProcessingException e) {
                        completedOrders.add(order.withStatus(OrderStatus.FAILED));
                        System.err.printf("       ✕ [%s] ERROR: Order #%d Failed: %s\n", name, order.orderId(), e.getMessage());
                    }
                }
            } catch (InterruptedException e) {
                // Thread interrupted during sleep/poll, exit gracefully
            }
        }
    }

    // --- 6. REPORT GENERATION (Java Streams Showcase) ---
    private static void generateReport() {
        System.out.println("=================================================");
        System.out.println("               SIMULATION REPORT                 ");
        System.out.println("=================================================");

        long totalProcessed = completedOrders.stream().filter(o -> o.status() == OrderStatus.PROCESSED).count();
        long totalFailed = completedOrders.stream().filter(o -> o.status() == OrderStatus.FAILED).count();

        System.out.println("Total Orders Handled: " + completedOrders.size());
        System.out.println(" Successful Orders:   " + totalProcessed);
        System.out.println(" Failed Orders:       " + totalFailed);

        // Calculate total revenue from successful orders
        double totalRevenue = completedOrders.stream()
                .filter(o -> o.status() == OrderStatus.PROCESSED)
                .mapToDouble(Order::price)
                .sum();
        System.out.printf("Total Revenue Generated: $%.2f\n\n", totalRevenue);

        System.out.println("--- Revenue Breakdown By Category ---");
        Map<ProductType, Double> revenueByCategory = completedOrders.stream()
                .filter(o -> o.status() == OrderStatus.PROCESSED)
                .collect(Collectors.groupingBy(
                        Order::productType,
                        Collectors.summingDouble(Order::price)
                ));

        revenueByCategory.forEach((category, revenue) ->
                System.out.printf(" - %-12s: $%.2f\n", category, revenue)
        );

        System.out.println("\n--- Top High-Value Customers (Orders > $250) ---");
        List<String> VIPs = completedOrders.stream()
                .filter(o -> o.status() == OrderStatus.PROCESSED)
                .filter(o -> o.price() > 250.0)
                .map(Order::customerName)
                .distinct()
                .toList();

        if(VIPs.isEmpty()) {
            System.out.println(" No high-value transactions occurred in this run.");
        } else {
            System.out.println(" VIP Customers: " + String.join(", ", VIPs));
        }
        System.out.println("=================================================");
    }
}