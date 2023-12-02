
import java.util.*;

public class Repeticion {



	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Introduce un párrafo: ");
	        String parrafo = sc.nextLine();

	        
	        List<String> palabras = Arrays.asList(parrafo.split(" "));

	       
	        Map<String, Integer> repeticiones = new HashMap<>();
	        for (String palabra : palabras) {
	            repeticiones.put(palabra, repeticiones.getOrDefault(palabra, 0) + 1);
	        }

	      
	        for (Map.Entry<String, Integer> entrada : repeticiones.entrySet()) {
	            System.out.println("La palabra '" + entrada.getKey() + "' se repite " + entrada.getValue() + " veces.");
	        }
	    }
	}

	
	

