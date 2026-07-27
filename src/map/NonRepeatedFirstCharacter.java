package map;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedFirstCharacter {

	public static void main(String[] args) {
        String value="ritheshkumar";
		
		char[] ch=value.toCharArray();
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<ch.length;i++) {
			map.put(ch[i],map.getOrDefault(ch[i],0)+1);
		}
		
	for (int i = 0; i < ch.length; i++) {

			    if (map.get(ch[i]) == 1) {
			        System.out.println("First non-repeated character: " + ch[i]);
			        break;
			    }
			}

	}

}
