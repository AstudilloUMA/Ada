////////////////////////////////////////////////////////////////////////////////////////////
// ALUMNO: ASTUDILLO FRAGA, PABLO
// GRUPO: SOFTWARE A
////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public final class BuscaElem {
	
	public static <T extends Comparable<? super T>> T kesimo(T v[], int k) {
		return kesimoRec(v,0,v.length-1,k);
	}

	public static <T extends Comparable<? super T>> T kesimoRec(T v[], int izq, int der, int k) {
		int ref = OrdenacionRapida.partir(v, v[izq], izq, der);
		
		if (ref == k) return v[ref];
		else if (ref < k) return kesimoRec(v, ref+1, der, k);
		else if (ref > k) return kesimoRec(v, izq, ref-1, k);
		else return v[izq];
		
    } 
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int maxvector;
		int i,k;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el numero de posiciones del vector: ");
		maxvector=sc.nextInt();
		Integer v[]=new Integer[maxvector];

		System.out.print("Introduce "+maxvector+" enteros separados por espacios: ");
		for (i=0;i<maxvector;i++) v[i]=sc.nextInt();
		System.out.print("Introduce la posicion k deseada (de 1-"+maxvector+"): ");k=sc.nextInt();
		Integer elem=kesimo(v,k-1);
		System.out.print("El elemento "+k+"-esimo es: "+elem);
	}

}
