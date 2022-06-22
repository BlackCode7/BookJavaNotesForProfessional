package numericPrimitiveJava.ChangeValuesAB;

import java.util.Scanner;

public class ChangeValuesAB {

	public static void main(String[] args) {
		/* Ler dois valores para as variáveis A e 8, efetuar a troca dos vatores de forma que a
		variável A passe a ter o valor da variável 8 e que a variável 8 passe a ter o valor da variável
		A. Apresentar os valores trocados.*/ 

		Scanner scanner = new Scanner(System.in);
		double a, b, aux;
		System.out.println("Digite numero a: ");
		a = scanner.nextDouble();
		System.out.println("Digite numero b: ");
		b = scanner.nextDouble();
		
		aux = a;
		a = b;
		b = aux;
		
		System.out.println("A = " + a + ", B = " + b);
		
	}

}
