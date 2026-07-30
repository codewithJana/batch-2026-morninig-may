package Assignment4;

import java.util.ArrayList;
import java.util.Iterator;

public class Question1 {
    static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(2);
        nums.add(4);
        nums.add(7);
        nums.add(2);
        nums.add(9);
        nums.add(4);

        ArrayList<Integer>NoDuplicate=new ArrayList<>();
        Iterator<Integer> iterator=nums.iterator();

        while(iterator.hasNext()){
            Integer num = iterator.next();
            if(NoDuplicate.contains(num)){
                iterator.remove();
            }
            else{
                NoDuplicate.add(num);
            }

        }

        System.out.println(nums);




    }
}
