package non_Primitive_datatype;

public class Arrays {
    static void main(String[] args) {

        //Array Declaration
        int[] marks;
        int number[];

        char[] alphabets;

        //Array creation/initialize values
        marks = new int[5];  //[100,50,80,90,60]
        // Index                 0  1  2  3  4
        marks[0] = 100;
        marks[1] = 50;
        marks[2] = 80;
        marks[3] = 90;
        marks[4] = 60;
        //initialization shortcut
        String[] names = {"john","peter","james","prem","Kishor"};
        System.out.println(marks[4]);
        System.out.println(names[2]);
        //update array values
        names[1] = "Thomas";
        System.out.println(names[1]);
        //get the size of array
        System.out.println(marks.length);
        System.out.println(names.length);

        //get all elements in the array
        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        //using for-each loop
        /*
        iteration 1 :  name = "john"
                       print "john"
        iteration 2:   name = "Thomas"
                       print "Thomas"
         .
         .
         .
         iteration last: name ="Prem"
                         print "prem"
         */
        for(String name  : names){
            System.out.println(name);
        }

        //2D Array
        /*
        1 2 3
        4 5 6
        7 8 9
         */

    }
}
