package hashset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetFlourAndCeilingOfANumber {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10,0};
		int x=7;
		
		TreeSet<Integer> set=new TreeSet<>();
		
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		
		System.out.print("flour:"+set.floor(x));
		System.out.print("Ceiling:"+set.ceiling(x));

		
		
		
		

		
	}

}
