package Conditional_Statement;

public class example_1 {
    static void main() {
        int a=10, b=50, c=30;
        if(a>b & a>c){
            System.out.println("a is greter: "+a);
        }
        else if(c>b){
            System.out.println("c is greter: "+c);
        }
        else{
            System.out.println("b is greter: "+b);
        }
    }
}
