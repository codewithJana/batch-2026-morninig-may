package hashset;

import java.util.HashSet;
import java.util.Set;

public class FindAllDuplicates {

	public static void main(String[] args) {
		int arr[]= {1,2,3,1,2,3,4,5,6,7};
		
		Set<Integer> seen=new HashSet<>();
		Set<Integer> duplicates=new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			
			//boolean result = seen.add(arr[i]); true- if element is present, false- if element is not present 
			
			if(!seen.add(arr[i])) { 
				duplicates.add(arr[i]);
			}
		}
		System.out.print(duplicates);
		System.out.print(seen);

	}

}
