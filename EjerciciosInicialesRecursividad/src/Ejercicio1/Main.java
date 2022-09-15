package Ejercicio1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int k,n;
			
			System.out.println("Introduzca el tamanyo de los conjuntos deseado: ");
			k = sc.nextInt();
			System.out.println("Introduzca el numero de elementos: ");
			n = sc.nextInt();	
			
			Par e1 = new Par(k,n);
			
			System.out.println("El numero de combinaciones es ");
			System.out.println(e1.combinaciones(n,k));
		}	
	}
}
