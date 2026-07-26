package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesWithoutSet {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,1,2,3,4));
		ArrayList<Integer> updatedlist=new ArrayList<>();
		
		for(int i=0;i<list.size();i++) {
			if(!updatedlist.contains(list.get(i))) {
				updatedlist.add(list.get(i));
			}
		}
		System.out.print(updatedlist);
	}
	

}
