package Tema3;

import java.util.Arrays;

public class Mayoritario {
	
	//Supongamos que pudiera ordenarse
	
	public static Integer mayoritario(int [] v) {
		Integer m = null;
		Arrays.sort(v); //MergeSort o QuickShort -> 0(nlogn)
		int i = 0;
		while (m == null && i < v.length) { //Coste O(n)
			if(v[i] == v[i + v.length/2]) m = v[i];
		}
		return m;
	}
	
	//Si no podemos ordenar
	
	public static Elem mayoritario2 (Elem [] v) {
		
		Elem m = null;
		m = buscaCandidato(v); //Coste buscaCandidato
		if(m != null) {
			if(!(frecuencia(v,m) > v.length/2)) m = null;
		}
		
		
		return m;
	}
	
	public static Elem buscaCandidato (Elem []v) {
		
		int n = v.length;
		Elem candidato = null;
		
		if(n > 0)
			if(n == 1) candidato = v[0];
			else {
				Elem [] aux = comparar2a2(v); //O(n)
				candidato = buscaCandidato(aux); //T(n/2)
				if(!(v.length % 2 == 0)) //O(1)
					if (candidato == null) candidato = v[v.length-1];
			}
		
		return candidato;
	}
	
	private static Elem[] comparar2a2(Elem[]v) {
		Elem [] aux = new Elem[v.length/2];
		int pos = 0;
		
		for(int i = 0; i < v.length; i += 2) {
			if((i+1 < v.length) && (v[i].equals(v[i+1]))) {
				aux[pos] = v[i];
				pos++;
			}
		}
		
		aux = Arrays.copyOf(aux,pos);
		return aux;
		
	}
	public static int frecuencia (Elem [] v, Elem m) {
		int f = 0;
		for(Elem valor : v) {
			if(m.equals(valor)) f++;
		}
		return f;
	}
	

}

class Elem{
	
	private int i;
	public Elem(int i) {
		this.i = i;
	}
	
	public String toString() {
		return "Elem(" + i + ")";
	}
}
