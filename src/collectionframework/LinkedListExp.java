package collectionframework;

/*
LinkedList:
   --> it is a class that store element as NODES.
   eg: ArrayList --> [B,C]
   Linkedlist --> [B]<-->[D]<-->[C]<-->[A]<-->[Z]

*/

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListExp {
    static void main(String[] args) {
        //concrete Implementation
        LinkedList<Integer> mylist = new LinkedList();
        mylist.add(100);
        mylist.add(101);
        mylist.add(102);
        System.out.println(mylist);

        //List[index] based approah
        List mylist2 = new LinkedList();

        //FIFO Queue approah
        Queue queue = new LinkedList();

        //Double Ended Queue approah
        Deque deque = new LinkedList();

        //remove
        mylist.remove(1);
        System.out.println(mylist);

        //insert
        mylist.add(1,200);
        System.out.println(mylist);

        //retrive index 2
        System.out.println(mylist.get(2));
    }
}
