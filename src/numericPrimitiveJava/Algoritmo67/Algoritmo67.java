package numericPrimitiveJava.Algoritmo67;

import java.util.Scanner;

public class Algoritmo67 {
	/*Efetuar o c�lculo do valor de uma presta��o em atraso, utilizando a f�rmula:
	presta��o =valor+ (valor*(taxa/100)*tempo).*/

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o valor da presta��o: ");
		double prestacao = scanner.nextDouble();
		System.out.println("Digite o valor da taxa: ");
		double taxa = scanner.nextDouble();
		System.out.println("Digite o valor: ");
		double valor = scanner.nextDouble();
		System.out.println("Digite o tempo (numero de meses): ");
		int tempo = scanner.nextInt();		
		
		double result;
		
		result = valor+(valor*(taxa/100)*tempo);
		System.out.println("Valor � pagar: " + result);

	}

}
