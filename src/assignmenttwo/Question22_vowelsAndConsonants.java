
package assignmenttwo;

public class Question22_vowelsAndConsonants {
	
	public static void main(String[] args) {
		String word="hello world 123!";
		
		int vowels=0;
		int consonants=0;
		
		char[] ch=word.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(Character.isLetter(ch[i])) {
				if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' ) {
					vowels++;
				}else {
					consonants++;
				}
			}
			
		}
		System.out.print(vowels+" "+consonants);
	}

}
