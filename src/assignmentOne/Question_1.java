package assignmentOne;

public class Question_1 {

	public static void main(String[] args) {
		question_1();

	}

	private static void question_1() {
		
		int n=10;
		
		for(int i=1;i<=n;i++) {
			if(i%2 == 0) {
				System.out.println(i+"->"+"Even");
			}else {
				System.out.println(i+"->"+"Odd");
			}
		}
		
	}

}
