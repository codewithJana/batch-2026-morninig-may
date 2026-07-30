package Assignment4;

import java.util.TreeMap;

public class Question24 {
    static void main(String[] args) {
        int[] keys={100,200,350,500};
        int query= 300;
        TreeMap<Integer,String> key=new TreeMap<>();
        for(int K:keys){
            key.put(K,"Keys");
        }

        System.out.print("Floorkey= "+key.floorKey(query)+" ");
        System.out.println("CeilingKey= "+key.ceilingKey(query));

    }
}
