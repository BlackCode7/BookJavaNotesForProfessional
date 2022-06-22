package numericPrimitiveJava.FindingStringWithinAnotherString;

public class FindingStringWithinAnotherString {

	public static void main(String[] args) {
		
		String str1 = "Hello World";
		String str2 = "Hello";
		String str3 = "helLO";
		
		System.out.println(str1.contains(str3));
		System.out.println(str2.contains(str1));
		System.out.println(str3.contains(str1));
		System.out.println(str3.contains(str1));

	}

}
