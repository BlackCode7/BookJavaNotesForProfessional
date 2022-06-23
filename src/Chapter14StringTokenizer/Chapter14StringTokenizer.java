package Chapter14StringTokenizer;

import java.util.StringTokenizer;

public class Chapter14StringTokenizer {
	
	static String  stringToken = "The set of delimiters (the characters that separate tokens) may be specified "
			+ "either at creation time or on a pertoken basis.";

	public static void main(String[] args) {
		useCaseStringTokenizer(stringToken);		
	}

	// Function for tokenizer strings
	public static void useCaseStringTokenizer( String token ) {
		StringTokenizer stringTokenizer = new StringTokenizer(stringToken);
		while( stringTokenizer.hasMoreTokens() ) {
			System.out.println(stringTokenizer.nextToken());
		}
	}

}
