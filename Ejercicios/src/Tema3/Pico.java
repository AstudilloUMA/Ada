package Tema3;


public class Pico {
	
	int pico (int [] a) { // En el peor caso la complejidad sera T(n) = Zeta(n)
		Integer valor = null;
		int i = 1;
		
		while(valor == null && i < a.length-1) {
			if((a[i] > a[i+1]) && (a[i] > a[i-1])) valor = a[i];
			i++; 
		}
		return valor;
	}
	
	public static int picoDyV (int [] a) {
		return picoR (a,0,a.length-1);	
	}
	
	private static int  picoR(int [] a, int inf, int sup) {
		Integer valor = null;
		
		int m = (inf + sup) / 2;
		
		if(a[m] > a[m+1] && a[m] < a[m-1]) valor = a[m];
		
		else if(a[m] > a[m-1]) valor = picoR(a, m, sup);
		
		else if(a[m] < a[m+1]) valor = picoR(a, inf, m);
		
		return valor;
	}

	
	
}
