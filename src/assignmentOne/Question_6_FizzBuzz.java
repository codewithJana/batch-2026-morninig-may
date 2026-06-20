package assignmentOne;

public class Question_6_FizzBuzz {

	public static void main(String[] args) {
		int n=50;
		int count=0;
		
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
				count++;	
			}else if(i%3==0) {
				System.out.println("Fizz");
			}else if(i%5==0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
		}
		System.out.println("FizzBuzz count:"+count);

	}

}
