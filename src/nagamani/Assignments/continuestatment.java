package nagamani.Assignments;
// print 10 numbers using for loop and skip 5 th number //
public class continuestatment {
    static void main(String[] args) {
        for (int i=1;i<=10;i++)
        {
            if (i==5){
                continue;//skip the flow when i =5 and continue the condition

            }
            System.out.print( i +" ");
        }


    }
}
