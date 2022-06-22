package numericPrimitiveJava;

public class ObjectCasting {
	
	static Float floatVar = new Float(42.0f);
	static Number n = floatVar; //Implicit (Float implements Number)
	static Float floatVar2 = (Float) n;
	//static Double doublevar = (Double) n;//Throws exception (the object is not Double)

	public static void main(String[] args) {
		
		System.out.println(floatVar);
		System.out.println(n);
		System.out.println(floatVar2);
		//System.out.println(doublevar);
		
	}

}
