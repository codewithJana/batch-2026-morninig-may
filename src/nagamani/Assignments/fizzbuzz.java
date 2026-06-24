package nagamani.Assignments;

public class fizzbuzz {
    static void main(String[] args) {
        int FIZZBUZZCount=0;
      for (int i=1;i<=50;i++){
        if (i%3==0 && i%5==0){
            System.out.print("FIZZBuzz ");
            FIZZBUZZCount++;
        }
        else if (i%3==0){
            System.out.print("Buzz ");
        } else if (i%5==0) {
            System.out.print("Fizz ");
        }
        else {
              System.out.print(i +" ");
          }


      }
      System.out.println();
      System.out.println("Total fizzbuzzcount "  +  FIZZBUZZCount);
    }

}
