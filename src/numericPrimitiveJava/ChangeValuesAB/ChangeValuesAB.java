package numericPrimitiveJava.ChangeValuesAB;

import java.util.Scanner;

public class ChangeValuesAB {

	public static void main(String[] args) {
		/* Ler dois valores para as vari�veis A e 8, efetuar a troca dos vatores de forma que a
		vari�vel A passe a ter o valor da vari�vel 8 e que a vari�vel 8 passe a ter o valor da vari�vel
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
