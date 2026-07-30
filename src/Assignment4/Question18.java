package Assignment4;

import java.util.HashMap;

public class Question18 {
    static void main(String[] args) {
        String word="programming";
        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch:word.toCharArray()){
           map.put(ch,map.getOrDefault(ch,0)+1);

        }

        System.out.println(map);

    }
}
