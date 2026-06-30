package assignmenttwo;

public class Question2 {
	
	public static void modify(Integer n, String s, int[] arr) {
		 n=100;
		 s="Original value";
		arr[0]=99;
	}

	public static void main(String[] args) {
		Integer num=10;
		String text="Original";
		int[] arr= {1,2,3};
		
		modify(num, text, arr);
		
		System.out.println("num = "+num);
		System.out.println("text = "+text);
		System.out.println("arr[0] = "+arr[0]);

	}

}
