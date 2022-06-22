package numericPrimitiveJava.Algoritmo67;

import java.util.Scanner;

public class Algoritmo67 {
	/*Efetuar o cálculo do valor de uma prestação em atraso, utilizando a fórmula:
	prestação =valor+ (valor*(taxa/100)*tempo).*/

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o valor da prestação: ");
		double prestacao = scanner.nextDouble();
		System.out.println("Digite o valor da taxa: ");
		double taxa = scanner.nextDouble();
		System.out.println("Digite o valor: ");
		double valor = scanner.nextDouble();
		System.out.println("Digite o tempo (numero de meses): ");
		int tempo = scanner.nextInt();		
		
		double result;
		
		result = valor+(valor*(taxa/100)*tempo);
		System.out.println("Valor à pagar: " + result);

	}

}
