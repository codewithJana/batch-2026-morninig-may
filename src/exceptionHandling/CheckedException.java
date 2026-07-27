package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

    //checked exception
    //compile time exception --> check will happen during compile time
    static void main(String[] args) {

        FileReader readText = null;
        //FileNotFoundException
        try{
//            readText = new FileReader("testdata.txt");
        }catch (Exception e){
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            System.out.println("File not found");
        }


    }

}

