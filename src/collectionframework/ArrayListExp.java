package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExp {
    static void main(String[] args) {
/*
1. Hetrogeneous data allowed
2. Insertion order - Preserved (Index)
3. Duplicate elements allowed
4. Multiple null allowed
 */

        //Different Declarations of ArrayList
        ArrayList myList = new ArrayList(); //store hetrogeneous data
        List myList2 = new ArrayList();
        ArrayList <Integer>myList3 = new ArrayList<Integer>(); //store only Integer object

        //add data inro ArrList
        myList.add("jana");
        myList.add(100);
        myList.add(true);
        myList.add(10.3);
        myList.add(null);
        myList.add(100);
        myList.add(null);

        //get all ArrList values
        System.out.println(myList);

        //length of the arrList
        System.out.println(myList.size());

        //remove element from arrList
        myList.remove(4);
        System.out.println(myList);

        //insert element in the 3rd position
        myList.add("animal"); //add or insert element at the end of arrList
        System.out.println(myList);
        myList.add(3,2000);
        System.out.println(myList);

        //modify/replace/change the element
        myList.set(2,false);
        System.out.println(myList);

        //access specific element
        System.out.println(myList.get(myList.size()-1));

        System.out.println("ForLoop starts");
        //loop arrList using For loop
        for (int i = 0; i < myList.size(); i++) {

            System.out.println(myList.get(i));
        }

        //loop arrList uding Foreach
        System.out.println("ForEachLoop starts");
        for (Object val :myList){

            System.out.println(val);
        }

        System.out.println("Iterator starts");
        //iterator
        Iterator itr = myList.iterator();
        System.out.println(itr.next());
        //hasnext() == chck the element existance
        //next() == get the current position of value
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        /*
        ["jana",100,121,"movie",true,"peter",'a','5']
         */

    }
}
