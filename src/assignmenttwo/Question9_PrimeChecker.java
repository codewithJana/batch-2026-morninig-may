package assignmenttwo;

public class Question9_PrimeChecker {

	public static void main(String[] args) {
		int n=12;
		
		boolean isPrime=true;
		
		for(int i=2;i<=n/2;i++) {
			if(n%i == 0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("its a prime number");
		}else {
			System.out.println("its not a prime number");
		}

	}

}
