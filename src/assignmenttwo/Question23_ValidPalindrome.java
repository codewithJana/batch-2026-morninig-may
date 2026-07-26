package assignmenttwo;

public class Question23_ValidPalindrome {

	public static void main(String[] args) {


		        String value = "A man, A plan, A canal: Panama";

		        value = value.toLowerCase();

		        StringBuilder sb = new StringBuilder();

		        for (int i = 0; i < value.length(); i++) {

		            if (Character.isLetterOrDigit(value.charAt(i))) {
		                sb.append(value.charAt(i));
		            }
		        }

		        String original = sb.toString();

		        StringBuilder reverse = new StringBuilder();

		        for (int i = original.length() - 1; i >= 0; i--) {
		            reverse.append(original.charAt(i));
		        }

		        if (original.equals(reverse.toString())) {
		            System.out.println("It's a Palindrome");
		        } else {
		            System.out.println("It's Not a Palindrome");
		        }
	}

}
