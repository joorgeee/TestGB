package prueba;
import java.util.*;
import java.lang.*;
import java.io.*;
public class pruebassd {
	


	
		public static void main(String[] args) throws java.lang.Exception {
	        Scanner scanner = new Scanner(System.in);

	        for (int i = 0; i < 3; i++) {
	            int A = scanner.nextInt();
	            int B = scanner.nextInt();
	            performCalculationsAndPrint(A, B);
	        }

	        scanner.close();
	    }

	    public static void performCalculationsAndPrint(int A, int B) {
	       //write your code here
	            int result_a = A*A + 2*A*B + B*B;
	            int result_b = A + B;
	            
	            System.out.println(result_a);
	            System.out.println(result_b);
	            
	            
	    
	}
}