package assignmentOne;

public class Question_5_skipANumberUsingContinue {

	public static void main(String[] args) {
		question_4();

	}

	private static void question_4() {
		int n=10;
		
		for(int i=0;i<=10;i++) {
			if(i==5) {
				continue;
			}
			System.out.print(i+" ");
		}
		
	}

}
