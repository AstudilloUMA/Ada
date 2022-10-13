package Tema3;

public class SumaMaxima {
	
	 	/* (aMejor, bMejor) = sumaMaxima(int[] a, int inf, int sup)
	 	 * 1.- Partir el vector por la mitad
	 	 * 2.- (a,b) es el mejor subvector de la izquierda,
	 	 * 		invocacion recursiva a sumaMaxima(a, inf, m-1)
	 	 * 3.- (a2,b2) es el mejor subvector de la derecha
	 	 * 		invocando sumaMaxima(a, sup, m+1)
	 	 * 4.- (a3,b3) es el mejor subvector del medio
	 	 * 5.- Devuelvo el mejor intervalo de suma mayor
	 	 */
	
	//Clase intervalo (inicio, final, suma)

		public static intervalo sumaMaxima(int []a, int inf, int sup){
			int m = (inf+sup) / 2;
			
			if (n == 1) {
				return (inf, inf, a[inf]);
			}
			
			(a1,b1,s1) = sumaMaxima(a, inf, m-1);
			(a2,b2,s2) = sumaMaxima(a, sup, m+1);
			
			int maxIzq = 	; int suma =	; int a3 = m;
			
			for (int i = m-1; i >= inf; i--) {
				suma += a[i];
				if(suma > maxIzq) {
					maxIzq = suma;
					a3 = i;
				}
			}
			
			int maxDer = 0; int suma = 0; int a3 = m;
			
			for (int i = m-1; i <= sup; i++) {
				suma += a[i];
				if(suma > maxDer) {
					maxDer = suma;
					b3 = i;
				}
			}
 		}
}
