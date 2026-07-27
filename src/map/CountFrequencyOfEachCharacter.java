package map;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfEachCharacter {

	public static void main(String[] args) {
		String value="kumarkumar";
		
		char[] ch=value.toCharArray();
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<ch.length;i++) {
			map.put(ch[i],map.getOrDefault(ch[i],0)+1);
		}
		
		for(Map.Entry<Character, Integer> m:map.entrySet()) {
			System.out.println(m.getKey()+"-->"+m.getValue());
		}
	}

}
