package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class PreserveFirstSeenOrder {

	public static void main(String[] args) {
		String value="the cat sat on the mat the cat ran";
		
		String[] values=value.split(" ");
		
		Map<String, Integer> map=new LinkedHashMap<>();
		
		for(int i=0;i<values.length;i++) 
		{
			map.put(values[i],map.getOrDefault(values[i],0)+1);
		}
		
		for(Map.Entry<String, Integer> m:map.entrySet()) {
			System.out.println(m.getKey()+"-->"+m.getValue());
		}

	}

}
