package Assignment4;

import java.util.LinkedHashSet;

public class Question14 {
    static void main(String[] args) {
        String[] pages={"p1","p2","p1","p3","p2","p4"};
        LinkedHashSet unique=new LinkedHashSet<>();
        for(String page:pages){
            unique.add(page);
        }
        System.out.println(unique);
    }
}
