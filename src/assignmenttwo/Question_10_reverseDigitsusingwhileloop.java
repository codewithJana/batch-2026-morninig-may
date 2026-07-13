package assignmenttwo;

public class Question_10_reverseDigitsusingwhileloop {

	public static void main(String[] args) {
		int value=-1234;
		int rev=0;
		
		int temp = Math.abs(value);
		
		while(temp>0) {
			int digit=temp%10;
			rev=rev*10+digit;
			temp=temp/10;
		}
		if (value < 0) {
            rev = -rev;
        }
		
		System.out.print(rev);

	}

}
