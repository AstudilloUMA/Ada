package Ejercicio3;

public class Busqueda {
	
	private int valor;
	private static int[] lista;
	
	public Busqueda(int valor, int[] lista) {
		valor = this.valor;
		for(int i = 0; i < lista.length; i++) {
			lista[i] = Busqueda.lista[i];
		}
	}
	
	public boolean esta(int val, int j) {
		boolean esta = false;
		int i = 0;
		
		if(val == lista[i]) esta = true;
		else {
			if(i != lista.length) esta = esta(val, i+1);		
		}
		return esta; 
	}

}
