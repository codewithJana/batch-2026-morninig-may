package Assignment2;

public class Question9 {
    public static boolean isPrime(int n) {
        if(n<2){
            return false;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }

   public static void main(String[] args) {
       int n=100;
       for(int i=1;i<=n;i++){
          if(isPrime(i)){
              System.out.print(i+" ");
          }
       }


    }
}
