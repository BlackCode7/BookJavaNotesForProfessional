package numericPrimitiveJava;

import java.io.PrintStream;

public class NumericPrimitiveJava {
	
	 /* type of variable */
	static byte byteVar = 42;
	static short shortVar = byteVar;
	static int intVar = shortVar;
	static long longVar = intVar;
	static double doubleVar = longVar;
	
	
	/* Expliciting types in varibles */
	static double doubleVar1 = 42.0d;
	static float floatVar1 = (float) doubleVar1;
	static long longVar1 = (long) floatVar1;
	static int intVar1 = (int) longVar1;
	static short shortVar1 = (short) intVar1;
	static byte byteVar1 = (byte) shortVar1;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(byteVar);
		System.out.println(shortVar);
		System.out.println(intVar);
		System.out.println(longVar);
		System.out.println(doubleVar);
		System.out.println(doubleVar1);
		System.out.println(floatVar1);
		System.out.println(longVar1);
		System.out.println(intVar1);
		System.out.println(shortVar1);
		System.out.println(byteVar1);

	}

}
