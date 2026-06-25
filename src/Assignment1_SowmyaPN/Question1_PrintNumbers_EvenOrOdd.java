package Assignment1_SowmyaPN;

public class Question1_PrintNumbers_EvenOrOdd {

    public static void main(String[] args) {
        System.out.println("Print Numbers 1 to 10 and identify the number as Even or odd");
        for (int i=0; i<=10; i++){
            if ( i%2 == 0){
                System.out.println(i + " --> is a Even Number");
            }
            else {
                System.out.println(i + " --> is an odd number");
            }
        }
    }
}
