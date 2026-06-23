package Conditional_Statement;

public class nested_ifelse_statement {
    static void main() {
        int x=2;
        if (x==0){
            if(1==1){
                System.out.println("xyz");
            }else{
                System.out.println("no xyz");
            }

        }else{
            if(3==2){
                System.out.println("abc");
            }
            else{
                System.out.println(" no abc");
            }
        }
    }
}

