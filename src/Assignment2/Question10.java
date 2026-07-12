package Assignment2;

public class Question10 {
    static void main(String[] args) {
        int num=-12340;
        int reverse=0;

      while(num!=0){
          int digit=num%10;
            reverse=reverse*10-digit;//0-4
           num=num/10;//-1234/10=-1234

        }
        System.out.println(reverse);
    }
}
