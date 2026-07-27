package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class HashMap_map {
    static void main(String[] args) {
        HashMap<Integer,String> students = new HashMap<>();
        //add new entry
        students.put(101,"Rahul");
        students.put(102,"Rahul");
        students.put(103,"James");
        students.put(104,"Admin");
        students.put(102,null);

        System.out.println(students);
        //Retrieve value
        System.out.println("Value of 104 is "+students.get(104));

        //Add only if the key doesnt exist
        students.putIfAbsent(101,"smith");
        System.out.println(students);

        //return default get value, if key doesnt exist
        System.out.println(students.getOrDefault(107,"Student NOT found"));

        //check key exists
        System.out.println(students.containsKey(101));

        //check value exists
        System.out.println(students.containsValue("user"));

        //replace values
        students.replace(102,"user");
        System.out.println(students.get(102));

        //remove
        students.remove(103);
        System.out.println(students);

        //size()
        //isEmpty()
        //clear()

        //Return all key
        System.out.println(students.keySet());

        //Return all values
        System.out.println(students.values());

        //return complete Key-Value pair using entry set
        for (Map.Entry<Integer,String> entry:students.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }

        //foreach
        students.forEach((key,value)->{
            System.out.println(key +":"+ value);
        });

    }

}
