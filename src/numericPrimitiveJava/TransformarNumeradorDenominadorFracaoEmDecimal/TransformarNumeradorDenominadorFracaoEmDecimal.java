package numericPrimitiveJava.TransformarNumeradorDenominadorFracaoEmDecimal;

public class TransformarNumeradorDenominadorFracaoEmDecimal {
	
	public static double num = 22;
	public static double denom = 15;
	
	public static double transformarNumeradorDenominadorFracaoEmDecimal(int num, int denom) {
		double result = num/denom;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(transformarNumeradorDenominadorFracaoEmDecimal(num, denom));

	}

	private static double transformarNumeradorDenominadorFracaoEmDecimal(double num2, double denom2) {
		double result = num2/denom2;
		return result;
	}

}
