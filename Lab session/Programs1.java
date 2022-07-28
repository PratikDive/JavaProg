package strings;

public class Programs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "He said, 'The smallest dog barks the loudest.' I heard it with my own ears.";
		
		int count = 0;
		for ( int i = 0; i < str.length(); i++)   
		{ 
		if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||    
				str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':')   
				{    
			count++;    
				} }
	System.out.println("the total number of punctuation is "+ count);

}
}