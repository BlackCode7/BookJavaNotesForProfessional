package Section13_1ComparingStringBufferStringBuilderFormatter;

import java.util.Formatter;
import java.util.StringJoiner;

public class Section13_1ComparingStringBufferStringBuilderFormatter {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * The StringBuffer class has been present since Java 1.0, and provides a variety of 
		 * methods for building and modifying a "buffer" containing a sequence of characters.
		 * 
		 * The StringBuilder class was added in Java 5 to address performance issues with 
		 * the original StringBufferclass. The APIs for the two clases are essentially the 
		 * same. The main difference between StringBuffer and StringBuilder is that the
		 * former is thread-safe and synchronized and the latter is not.
		 * 
		 * The Formatter class was added in Java 5, and is loosely modeled on the sprintf 
		 * function in the C standard library. It takes a format string with embedded format 
		 * specifiers and a sequences of other arguments, and generates a string by converting 
		 * the arguments into text and substituting them in place of the format specifiers. 
		 * The details of the format specifiers say how the arguments are converted into text.
		 * 
		 * The StringJoiner class was added in Java 8. It is a special purpose formatter that 
		 * succinctly formats a sequence of strings with separators between them. 
		 * It is designed with a fluent API, and can be used with Java 8 streams.		 * 
		 */
		
		// case user Formatter example
		caseUserFormatter();
		
		// case user StringJoiner		
		caseUserStringJoiner();
		
		// case user StringBuilder and StringBuffer
		caseUserStringBuilderAndStringBuffer(); 

	}
	
	public static void caseUserStringBuilderAndStringBuffer() {
		int one = 1;
		String color = "Blue";
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("One=").append(one).append(", Color=").append(color).append('\n');
		System.out.println("StringBuilder and StringBuffer " + strBuilder);		
	}

	public static void caseUserStringJoiner() {
		StringJoiner stringjoiner1 = new StringJoiner(", ", "[", "]");
		for (String s: new String[] {"A", "B", "C"}) {
			stringjoiner1.add(s);
		}
		System.out.println(stringjoiner1);
	}

	public static void caseUserFormatter() {
		int one = 1;
		String color = "red";
		Formatter formatter = new Formatter();
		System.out.println(formatter.format("One=%d, Color=%s%n", one, color));
		System.out.print(String.format("One2=%d, Color2=%s%n", one, color));
	}

}
