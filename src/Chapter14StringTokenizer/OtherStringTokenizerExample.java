package Chapter14StringTokenizer;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class OtherStringTokenizerExample {

	private static String separators = ",";
	private static String[] list = {"Carro", "Caixa", "Caixalote"};
	private static String list2 = "Carro Caixa Caixalote";
	private static boolean include;	

	public static void main(String[] args) {		
		tokenizerExample(list, separators,  include);	
		tokenizeToString(list2);
	}

	private static ArrayList<String> tokenizeToString(String list2) {

		ArrayList<String> tokens = new ArrayList<>();		
		StringTokenizer tokenizer = new StringTokenizer(list2);		
		while(tokenizer.hasMoreElements()) { // hasMoreElements() convert enumerates in iterables
			tokens.add(tokenizer.nextToken());
		}		
		return tokens ;
		
	}

	/* Convet enumerates in iterables with  hasMoreElements() */
	public static String[] tokenizerExample(String[] separators, String list, boolean include) {			
			StringTokenizer tokens = new StringTokenizer(list);			
			String[] result = new String[tokens.countTokens()];					
			int i = 0;			
			while( tokens.hasMoreTokens() ) {
				result[i++] = tokens.nextToken();
			}			
			return result;		
	}
	
	
}





















