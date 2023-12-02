import java.util.*;
public class Verificacion {





	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Introduce un texto: ");
	        String texto = sc.nextLine();

	
	        List<Character> caracteres = new ArrayList<>();
	        for (char c : texto.toCharArray()) {
	            if (Character.isLetter(c)) {
	                caracteres.add(Character.toLowerCase(c));
	            }
	        }

	
	        boolean esHeterograma = true;
	        Set<Character> caracteresUnicos = new HashSet<>();
	        for (char caracter : caracteres) {
	            if (!caracteresUnicos.add(caracter)) {
	                esHeterograma = false;
	                break;
	            }
	        }

	    
	        String tipoPalabra;
	        if (esHeterograma) {
	            tipoPalabra = "heterograma";
	        } else {
	            tipoPalabra = "isograma";
	        }

	        System.out.println("El texto es un " + tipoPalabra + ".");
	    }
	}


