package Assignment4;

import java.util.TreeSet;

public class Question16 {
    static void main(String[] args) {
        TreeSet<Integer>arr=new TreeSet<>();
        arr.add(7);
        arr.add(2);
        arr.add(9);
        arr.add(4);
        arr.add(1);
        arr.add(8);
        int k=3;
        for(int i=1;i<k;i++){
            arr.pollFirst();
        }
        System.out.println("3rd Smallest "+arr.first());

        for(int j=1;j<k;j++){
            arr.pollLast();
        }
        System.out.println("3rd Largest "+arr.last());

    }
}
