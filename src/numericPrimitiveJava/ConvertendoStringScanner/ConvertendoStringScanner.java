package numericPrimitiveJava.ConvertendoStringScanner;

import java.util.Scanner;

public class ConvertendoStringScanner {

	public static void main(String[] args) {
		/*
	 	1. Declare a string.
		2. Input the string.
		3. Convert the string into a character array.
		4. Input the character that is to be searched.
		5. Search for the character into the character array.
		6. If found,check if the character is lowercase or uppercase.
		If Uppercase, add 32 to the ASCII code of the character.
		If Lowercase, subtract 32 from the ASCII code of the character.
		7. Change the original character from the Character array.
		8. Convert the character array back into the string. 
		------------------------------------------------------------
		1. Declare um string.
		2. Digite a cadeia de caracteres.
		3. Converta a cadeia de caracteres em uma matriz de caracteres.
		4. Insira o caractere que deve ser pesquisado.
		5. Pesquisar o caractere na matriz de caracteres.
		6. Se encontrado, verifique se o caractere está em minúsculas ou em maiúsculas.
		Se maiúsculas, adicione 32 ao código ASCII do caractere.
		Se letras minúsculas, subtraia 32 do código ASCII do caractere.
		7. Mude o caractere original da matriz de caracteres.
		8. 8. Converta a matriz de caracteres de volta para a cadeia de caracteres.
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre with String");
		String s = scanner.next();
		char[] a = s.toCharArray();
		System.out.println("Enter the character you are looking for");
		System.out.println(s);
		
		String c = scanner.next();
		char d = c.charAt(0);
		
		for (int i = 0; i <= s.length(); i++) {
			if(a[i] == d) {
				if(d >= 'a' && d <= 'z') {
					d -= 32;
				} else if (d >= 'A' && d <= 'Z') {
					d += 32;
				}
				a[i] = d;
				break;
			}
		}
		
		s = String.valueOf(a);
		System.out.println(s);
		
	}

}
