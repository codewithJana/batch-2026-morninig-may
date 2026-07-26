package hashset;

import java.util.TreeSet;

public class FindTheValuesInRange {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,0,1,2,3};
		
		TreeSet<Integer> set=new TreeSet<>();
		
		for(int n:arr) {
			set.add(n);
		}
		
		System.out.println(set);
		System.out.println(set.subSet(4,8));
	}

}
