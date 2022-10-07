import java.math.*;
public class Analizador {
	
	/* 
	 * NOTA IMPORTANTE
	 * 
	 * Esta clase se proporciona solamente para ilustrar el formato de
	 * salida que deberia tener la solucion a este ejericio.
	 * Esta clase debe modificarse completamente para cumplir 
	 * mínimamente los requisitos de esta practica.
	 * Notese que ni siquiera esta completa......
	 */
	
	public static String masCercano(double ratio) {
			if (ratio < 1.5) {                      // aprox 1.0
				return "1";							
			} else if (1 <= ratio && ratio < 3.0) { // aprox 2.0
				return "N";
			} else if (3 <= ratio && ratio < 6.0) { // aprox 4.0
				return "N2";
			} else if (6 <= ratio && ratio < 10.0) { // aprox 8.0
				return "N3";
			} else { 								 // otras
				return "NF";
			}
	}
	
	public static void main(String arg[]) {
		int [] n1 = {10000, 20000, 30000};
		int n2 = 20000;
		double [] ratios = new double [n1.length];
		Temporizador t = new Temporizador();

		for (int i = 0; i < n1.length; i++) {
			
			t.iniciar();
			Algoritmo.f(n1[i]);
			t.parar();
			long t1 = t.tiempoPasado();
		
			t.reiniciar();
			t.iniciar();
			Algoritmo.f(n2);
			t.parar();
		
			long t2 = t.tiempoPasado();
			ratios[i] = (double)t2/t1;
			System.out.println(ratios + " " + masCercano(ratios[i]));
		}

	}
	
	public static int fact (int x) {
		if(x == 0) {
			return 1;
		} else {
			return x*fact(x--);
		}
	}
	
	public static int lineal (int n) {
		return n;
	}
	
	public static int cuadratica (int n) {
		return n*n;
	}
	
	public static int cubica (int n) {
		return n*n*n;
	}
	
	public static double logaritmica (double n) {
		return Math.log(n);
	}
	
	public static double logLineal (double n) {
		return n*Math.log(n);
	}
	
	public static int exponencial(int n) {
		return 2^n;
	}
	
	public static int factorial (int n) {
		return fact(n);
	}
	
	
	
}
