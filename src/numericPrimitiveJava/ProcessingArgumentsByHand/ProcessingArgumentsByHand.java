package numericPrimitiveJava.ProcessingArgumentsByHand;

public class ProcessingArgumentsByHand {

	public static void main(String[] args) {
		
	//	if(args.length > 0) {
	//		System.out.println("usage: myapp");
	//		System.exit(1);
	//	}
		
		// Run the application
	//	System.out.println("It Worked !");

	//}
	
	/*public static void main(String[] args) {		
		if(args.length != 2) {
			System.out.println("usage: myapp <arg1> <arg2>");
			System.exit(1);
		}		
		// Run the application
		System.out.println("It Worked :" + args[0] + " " + args[1]);
	}*/
	
	boolean feelMe = false;
	boolean seeMe = false;
	int index;
	
	loop: for(index=0; index<args.length; index++) {
		String opt = args[index];
		switch (opt){
		case "-c":
			seeMe = true;
			break;
		case "-f":
			feelMe = true;
			break;
		default:
			if(!opts.isEmpty() && opts.charAt(0) == "-") {
				error("Unknown option: '" + opt + "'");
			}
			break loop;
		}
	}
	
  }

	private static void error(String message){
		if (message != null) {
			System.err.println(message);
		}
		System.err.println("usage: myapp [-f] [-c] [ <arg> ...]");
		System.exit(1);		
	}

}
