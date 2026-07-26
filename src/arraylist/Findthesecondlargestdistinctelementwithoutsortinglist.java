package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Findthesecondlargestdistinctelementwithoutsortinglist {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>(Arrays.asList(12,45,2,41,45,7));
		int secondmax=Integer.MIN_VALUE;
		int firstmax=Integer.MIN_VALUE;
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i) > firstmax) {
				secondmax=firstmax;
				firstmax=list.get(i);
			}else if(list.get(i) > secondmax && firstmax != list.get(i)) {
				secondmax=list.get(i);
			}
		}
		System.out.println(firstmax);
		System.out.println(secondmax);

		
		

	}

}
