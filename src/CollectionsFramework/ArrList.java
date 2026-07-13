package CollectionsFramework;

/*
1. Supports Heterogeneous data
2. Insertion order --> Preserved [Indexing]
3. Duplicate values
4. Dynamic resizing the data
5. multiple null values

when to use (recommendation - best fit for frequent data fetching/reading)
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrList {

    static void main(String[] args) {

        //Arr list Declaration
        ArrayList mylist = new ArrayList();
        List myList = new ArrayList();
        ArrayList <Integer>Mylist = new ArrayList<Integer>();

        //add objects into myList
        mylist.add(100);
        mylist.add("Jana");
        mylist.add(true);
        mylist.add(10.5);
        mylist.add('a');
        mylist.add(null);
        mylist.add(null);

        //print all the objects
        System.out.println("Print all objects in myList: " + mylist);

        //get length of ArrayList
        System.out.println("The length of mylist is: "+mylist.size());

        //remove elements from the mylist
        mylist.remove(5);
        System.out.println("After removed 5th position: "+mylist);
        mylist.add(101);
        System.out.println("After added new value "+mylist);

        //insert element in 2nd position
        mylist.add(2,"animal");
        System.out.println("Insert object in 2nd position: "+mylist);

        //modify/replace/change objects in mylist
        mylist.set(1,"peter");
        System.out.println("Replace Jana with Peter: "+mylist);

        //access specific index position
        System.out.println("Get the 4th index position value: "+mylist.get(4));

        //iterate and get values of mylist using for loop
        System.out.println("***Iterate using for loop***");
        for(int i=0;i<mylist.size();i++){
            System.out.println(mylist.get(i));
        }

        //Iterate and get values of mylist using for..each loop
        System.out.println("***Iterate using for..each loop***");
        for (Object list : mylist){
            System.out.println(list);
        }

        System.out.println("***Iterate using Iterator class ***");
        Iterator itr = mylist.iterator();
        //System.out.println(itr.next());
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
