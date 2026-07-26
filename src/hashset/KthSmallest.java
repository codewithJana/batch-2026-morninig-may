package hashset;

import java.util.TreeSet;

public class KthSmallest {

	public static void main(String[] args) {
		test();
		testone();

	}

	private static void testone() {
		 int[] arr = {7,10,4,3,20,15};
	        int k = 3;

	        TreeSet<Integer> set = new TreeSet<>();

	        for (int num : arr) {
	            set.add(num);
	        }

	        for (int i = 1; i < k; i++) {
	            set.pollFirst();
	        }

	        System.out.println("Kth Smallest = " + set.first());
	        
	        //first - returns first small number
	        //pollfirst - returns first small number and removes from array
		
	}

	private static void test() {
		 int[] arr = {7,10,4,3,20,15};
	        int k = 3;

	        TreeSet<Integer> set = new TreeSet<>();

	        for (int num : arr) {
	            set.add(num);
	        }

	        for (int i = 1; i < k; i++) {
	            set.pollLast();
	        }

	        System.out.println("Kth Largest = " + set.last());
	        
	        //returns last element and removes from array --> polllast()
	      //returns last element --> last()
		
	}

}
