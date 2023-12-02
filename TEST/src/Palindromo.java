import java.util.Scanner;

public class Palindromo {
	
/*codigo creado por Jorge Martinez*/

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Bienvenido, Introduce una cadena de texto: ");
	        String texto = sc.nextLine();

	        boolean Validacion = true;
	        for (int i = 0; i < texto.length() / 2; i++) {
	            if (texto.charAt(i) != texto.charAt(texto.length() - i - 1)) {
	                Validacion = false;
	                break;
	            }
	        }

	        if (Validacion) {
	            System.out.println("La cadena es un palíndromo");
	        } else {
	            System.out.println("La cadena no es un palíndromo");
	        }
	    }
	}
