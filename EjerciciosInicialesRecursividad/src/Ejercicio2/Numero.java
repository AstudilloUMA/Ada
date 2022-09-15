package Ejercicio2;

public class Numero {
	
	private int num;
	
	public Numero(int num) {
		num = this.num;	
	}
	
	public int resto(int n) {
		int rest;
		if (n == 1) {
			rest = 1;
		}
		else {
			rest = resto(n/2)*10 + n%2;
		}
	
		return rest;
		}
	
}
