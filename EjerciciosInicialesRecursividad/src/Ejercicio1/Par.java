package Ejercicio1;
public class Par {
	
	private int k,n;
	
	public Par (int k, int n) {
		k = this.k;
		n = this.n;
	}
	
	public int combinaciones(int n, int k) {
	
		int comb;
		
		if(k == 0 || k == n) comb = 1;
		else comb = combinaciones(n-1, k-1) + combinaciones(n-1, k);

		return comb;	
	}
	
}
