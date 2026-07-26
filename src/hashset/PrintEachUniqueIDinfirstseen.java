package hashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintEachUniqueIDinfirstseen {

	public static void main(String[] args) {
		String[] str= {"p1","p2","p3","p4","p1","p2","p4"};
		
		Set<String> set=new LinkedHashSet<>();
		
		for(String n:str) {
			set.add(n);
		}
		System.out.print(set);

	}

}
