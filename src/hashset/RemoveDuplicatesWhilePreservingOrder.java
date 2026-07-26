package hashset;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWhilePreservingOrder {

	public static void main(String[] args) {
		int[] arr= {1,2,3,5,6,4,1,2,4,5,6,9};
		
		Set<Integer> set=new LinkedHashSet<>();
		
		for(int n:arr) {
			set.add(n);
		}
		
		System.out.print(set);
		
		int[] result = new int[set.size()];

		int index = 0;

		for (int num : set) {
		    result[index++] = num;
		}
		System.out.print(Arrays.toString(result));

	}

}
