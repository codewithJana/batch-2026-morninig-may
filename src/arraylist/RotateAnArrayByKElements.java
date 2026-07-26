package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateAnArrayByKElements {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		Collections.rotate(list,3);
		System.out.println(list);
		list.subList(4, list.size()-1);
		System.out.println(list);
	}

}
