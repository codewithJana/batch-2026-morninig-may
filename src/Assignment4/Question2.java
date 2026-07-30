package Assignment4;

import java.util.ArrayList;

public class Question2 {
    static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(12);
        nums.add(45);
        nums.add(2);
        nums.add(41);
        nums.add(45);
        nums.add(7);

        int Big=Integer.MIN_VALUE;
        int secondBig=Integer.MIN_VALUE;

        for(int num:nums){
            if(num>Big){
                secondBig=Big;
                Big=num;
            }
            else if(num>secondBig && num<Big){
                secondBig=num;
            }

        }
        System.out.println(Integer.MIN_VALUE);

        System.out.println(secondBig);


    }

}
