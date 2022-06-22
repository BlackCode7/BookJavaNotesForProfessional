package numericPrimitiveJava.ComparingStringsInSwitchStatement;

public class ComparingStringsInSwitchStatement {

	public static void main(String[] args) {

		String stringToSwitch = "A";
		
		switch (stringToSwitch) {
		case "a":
			System.out.println("a");
			break;
		case "A":
			System.out.println("A");
			break;
		case "B":
			System.out.println("B");
			break;
		default:
			break;
		}
		
		System.out.println(stringToSwitch.equals("foo"));

	}

}
