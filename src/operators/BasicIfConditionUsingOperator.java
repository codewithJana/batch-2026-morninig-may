package operators;

import java.util.Scanner;

public class BasicIfConditionUsingOperator {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		
		if(18>n) {
			System.out.print("n is greater than 18");
		}else {
			System.out.print("n is less than 18");
		}
		
	}

}
