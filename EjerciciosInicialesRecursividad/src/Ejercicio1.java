import java.util.*;

public class Ejercicio1 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public int tamanyo() {
		System.out.println("Introduzca el tamanyo de los conjuntos deseado: ");
		return sc.nextInt();
	}
	
	public int nelem() {
		System.out.println("Introduzca el numero de elementos: ");
		return sc.nextInt();	
	}
	
	public int combinaciones(int n, int k) {
	
		int combinaciones = 1;
		if((k > 0) && (k < n)) {
			combinaciones = combinaciones(n-1, k-1) + combinaciones(n-1, k);
		}
		return combinaciones;	
	}
	
	public static void main() {
		
	}

}
