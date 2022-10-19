package Tema3;

public class EsSuma {
	
	public static boolean esSuma(int [] v, int s) {
		
		boolean esSuma = false;
		// mergeSort(v); 
		int i = 0;
		// Coste del trozo: O(nlogn)
		while(!esSuma && i < v.length-1) { // O(n) iteraciones 
			// esSuma = busquedaBinaria(v,s-v[i]);  //O(logn)
			i++;
		}
	
		return esSuma;
	}
	
	public static boolean esSuma2(int [] v, int s) {
		return esSuma3(v,s,0,v.length-1);
	}
	
	public static boolean esSuma3(int [] v, int s, int izq, int der) {
		boolean esSuma = false;
		if(izq <= der) {
			int m = (izq + der)/2;
			esSuma = esSuma3(v,s,izq,m);
			if(!esSuma) {
				esSuma = esSuma3(v,s,m,der);
				if(!esSuma) esSuma = mezclarYComprobar(v,s,izq,m,der);
			}
		}
			
			
		return esSuma;
	}
	
	public static boolean mezclarYComprobar(int []a, int s, int inf, int medio, int sup) {
		
		int i = inf; int j = medio+1;
		int[] b = new int[sup-inf+1];
		int k = 0;
		
		while (i<=medio && j <=sup){
			if (a[i]<=a[j]) {b[k] = a[i];i++;}
			else { b[k] = a[j];j++; }
			k++;
		}
		
		while (i<=medio){
			b[k] = a[i];
			i++; k++;
		}
		
		while (j<=sup){
			b[k] = a[j];
			j++; k++;
		}
		
		k=0;
		for (int f=inf; f<= sup; f++){
			a[f] = b[k]; k++;
		}
		
		int ini = inf; int fin = sup; boolean res = false;
		
		while (!res && ini < fin) {
			if(a[ini] + a[fin] == s) res = true;
			else if (a[ini] + a[fin] < s) ini ++;
			else if (a[ini] + a[fin] > s) fin++;
		}
	
		return res;
	}

}
