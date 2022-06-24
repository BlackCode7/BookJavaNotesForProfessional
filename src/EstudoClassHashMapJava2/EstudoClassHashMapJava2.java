package EstudoClassHashMapJava2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EstudoClassHashMapJava2 {

	public static void main(String[] args) {
		
		// Create HashMap
		HashMap<String, String> Geeks = new HashMap<>(); 

		 // 2   Adding values to HashMap as ("keys", "values")
        Geeks.put("Thiron Lennister", "Anão");
        Geeks.put("Aria Stark", "Assassina");
        Geeks.put("John Snow", "Corvo da noite");
        Geeks.put("Danerys Targeryan", "Mãe de Dragões");
		
        // 3  containsKey() method is to check the presence
        // of a particluar key Since 'Code' key present here, the condition is
        
        if( Geeks.containsKey("Thiron Lennister") ) 
        	System.out.println("Testing .containsKey : " + Geeks.get("Thiron Lennister"));
        
        // 4 keySet() method returns all the keys in HashMap
		Collection<String> GeeksValues = Geeks.values();
		System.out.println("Initial values: " + GeeksValues);
		
		// Adding new set of key-value
		Geeks.put( "Cersey Lennister", "Rainha Westheros" );
		
		// Again using .keySet() and .values() methods
		System.out.println("New Keys : " + Geeks);
		System.out.println("New Values : " + GeeksValues);
        
		Set<Map.Entry<String, String>> mappingGeeks = Geeks.entrySet();
		System.out.println("New Values : " + mappingGeeks);
		

		System.out.println("Set of Keys and Values using entrySet() : "+mappingGeeks);
        System.out.println();
        
        System.out.println("Using .getorDefault : " + Geeks.getOrDefault("Code","javaArticle"));
        System.out.println("Using .getorDefault : " + Geeks.getOrDefault("Search","javaArticle"));
        System.out.println();

        Geeks.replace("Learn", "Methods");
        System.out.println("working of .replace() : "+mappingGeeks);
        System.out.println();
	
        /* .putIfAbsent() method is placing a new key-value as they were not present initially*/
	    Geeks.putIfAbsent("cool", "HashMap methods");
	    System.out.println("working of .putIfAbsent() : "+mappingGeeks);
	
	    /* .putIfAbsent() method is not doing anything as key-value were already present */
	    Geeks.putIfAbsent("Code", "With_JAVA");
	    System.out.println("working of .putIfAbsent() : "+mappingGeeks);
		
	
	
	
	}

}




















