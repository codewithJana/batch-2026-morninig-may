package Assignment4;

import java.util.HashSet;

public class Question11 {
    static void main(String[] args) {
     int[] array={5, 3, 8, 3, 5, 9, 8, 5};


        HashSet<Integer> seen=new HashSet<>();
        HashSet<Integer> duplicates=new HashSet<>();
     for(int num:array){
         if(seen.contains(num)){
             duplicates.add(num);
         }else {
             seen.add(num);
         }
     }
        System.out.println("duplicate entry:"+ duplicates);

    }
}
