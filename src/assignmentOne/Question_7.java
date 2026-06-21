package assignmentOne;

import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {
		question_7();

	}

	private static void question_7() {
		
		Scanner sc=new Scanner(System.in);
		
		int max=3;
		int count=1;
		
		while(count<=max) {
			
			System.out.print("Enter the PIN:");
			int value=sc.nextInt();
			
				if(value == 4521) {
					System.out.println("Access Granted.Welcome!");
					break;
				}else if(count==max){
					System.out.println("Card Blocked.Contact your Bank");
				}else {
					System.out.println("Incorrect PIN. "+(max-count)+" attempts(s) remaning");
				}
				count++;
		}	
	}

}
