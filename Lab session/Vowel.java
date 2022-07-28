package strings;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String Str = "My Name is Pratik Vilas Dive ";
		
		int vowel = 0;
		for (int i =0; i<Str.length(); i++) {
			if(Str.charAt(i)=='a' || Str.charAt(i)=='e' || Str.charAt(i)=='i' ||Str.charAt(i)=='o' || Str.charAt(i)=='u') {
				vowel++;
			}
		}
		System.out.println(vowel);
		
		int consonant = 0;
		for (int i =0; i<Str.length(); i++) {
			if(Str.charAt(i)!='a' || Str.charAt(i)!='e' || Str.charAt(i)!='i' ||Str.charAt(i)!='o' || Str.charAt(i)!='u') {
				consonant++;
			}
		}
		
		System.out.println(consonant);
		
	}

}
