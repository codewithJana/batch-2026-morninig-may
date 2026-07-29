package Assignment_4;

import java.util.TreeMap;

public class question_23 {
    static void main() {
        // Create TreeMap
        TreeMap<String, Integer> employees = new TreeMap<String, Integer>();

        // Add employee name and salary
        employees.put("Ravi", 50000);
        employees.put("Anu", 60000);
        employees.put("Kiran", 55000);

        // Print employees sorted by name
        System.out.println(employees);
    }
}
