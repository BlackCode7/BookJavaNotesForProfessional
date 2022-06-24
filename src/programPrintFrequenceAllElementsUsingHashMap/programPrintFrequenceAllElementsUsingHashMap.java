package programPrintFrequenceAllElementsUsingHashMap;

import java.util.HashMap;
import java.util.Map;

public class programPrintFrequenceAllElementsUsingHashMap {

	public static void main(String[] args) {

		int arr[] = { 440, 20, 13, 440, 1, 62, 62, 440, 20, 20, 20 };
		programprintFrequenceAllElementsUsingHashMap(arr);
		
	}
	
	// Count frequence int in array[]
	static void programprintFrequenceAllElementsUsingHashMap( int arr[] ) {
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		// Traverse through the given array
		for(int i = 0; i < arr.length; i++) {
			Integer c = hashmap.get(arr[i]);
			
			if( hashmap.get(arr[i]) == null )
				hashmap.put(arr[i], 1);			
			else
				hashmap.put(arr[i], ++c);			
		}		
		for(Map.Entry m:hashmap.entrySet())
			System.out.println( "Frequence of " + m.getKey() + " is " + m.getValue());		
	}
	

}
