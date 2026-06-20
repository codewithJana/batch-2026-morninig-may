package assignmentOne;

public class Question_3_PrintArrayValues {

	public static void main(String[] args) {
		question_3();

	}

	private static void question_3() {
		int[] arr= {85,92,67,78,55,90};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Index "+i+":"+arr[i]);
		}
		System.out.println("Total elements:"+arr.length);
		
	}

}
