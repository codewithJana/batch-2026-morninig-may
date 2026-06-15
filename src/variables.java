import java.util.SortedSet;

public class variables {
    static int a=10;  //static variable
    int c=10;        //instance variable
    void fun(){
        int b=10;      //local variable
        System.out.println("static:"+a+ " local:"+b+" instance:"+c);
        ++a;
        ++b;
        ++c;
    }

    static void main() {
        variables r= new variables();
        r.fun();
        r.fun();
        variables m=new variables();
        m.fun();
        m.fun();
    }
}
