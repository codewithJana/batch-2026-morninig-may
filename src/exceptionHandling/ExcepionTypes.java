package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExcepionTypes {

    static void main(String[] args) {
        System.out.println("program starts");
        //checked Exception
        //compiler checks the exception and it forces to handle it running before
        try {
            FileReader book = new FileReader("testdata/myBook.txt");
            book.read();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());        }
        System.out.println("program ends");
    }

}
