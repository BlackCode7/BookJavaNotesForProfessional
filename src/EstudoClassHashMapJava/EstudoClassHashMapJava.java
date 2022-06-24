package EstudoClassHashMapJava;

import java.util.HashMap;

public class EstudoClassHashMapJava {
	/*	 
	 * https://acervolima.com/metodos-de-classe-hashmap-em-java-com-exemplos-conjunto-1-put-get-isempty-e-size/
	 * 
	  1 -> put(): java.util.HashMap.put() desempenha um papel na associação do valor 
	  		 especificado com a chave especificada neste mapa. Se o mapa continha anteriormente 
	  		 um mapeamento para a chave, o valor antigo é substituído.
	  		
	  2 -> get(): o método java.util.HashMap.get() retorna o valor para o qual a chave 
	  		 especificada é mapeada ou null se este mapa não contém mapeamento para a chave.
	  		 
	  3 -> isEmpty(): o método java.util.HashMap.isEmpty() retorna verdadeiro se o mapa 
	  		 não contém mapeamentos de valores-chave.
	  
	  4 -> size(): java.util.HashMap.size() retorna o número de mapeamentos de valores-chave 
	  		 neste mapa.	  		 
	 */
	
	public static void main(String[] args) {
		
		// Creation of HashMap
		HashMap<String, String> Geeks = new HashMap<>();
		Geeks.put("Anderson", "DevFullStack");
		Geeks.put("Carlos", "DevFullStack");
		Geeks.put("Marcelo", "DevBackEnd");
		
		System.out.println("Testing .isEmpty() method");
		
		if( !Geeks.isEmpty() ) {

			System.out.println("HashMap Geeks is noteempty");
			
			// Accessing the contents of HashMap through Keys
			System.out.println("GEEKS : " + Geeks.get("Anderson"));
			System.out.println("GEEKS : " + Geeks.get("Carlos"));
			System.out.println("GEEKS : " + Geeks.get("Marcelo"));
			
            // size() method prints the size of HashMap.
			System.out.println("Size Of HashMap : " + Geeks.size());
		}
		
		
		
	}

}
