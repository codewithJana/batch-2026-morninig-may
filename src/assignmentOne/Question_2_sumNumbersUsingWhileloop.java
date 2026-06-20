package assignmentOne;

public class Question_2_sumNumbersUsingWhileloop {

	public static void main(String[] args) {
		question_2();

	}

	private static void question_2() {
		int i=1;
		int sum=0;
		
		while(i<=20) {
			sum = sum+i;
			i++;
		}
		System.out.print("Sum of "+i+"to 20="+sum);
		
	}

}
