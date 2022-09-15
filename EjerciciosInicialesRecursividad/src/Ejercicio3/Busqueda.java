package Ejercicio3;

public class Busqueda {
	
	private int valor;
	public static int[] Lista;
	
	public static int[] getLista() {
		return Lista;
	}

	public static void setLista(int[] lista) {
		Lista = lista;
	}

	public Busqueda(int valor, int[] array) {
		valor = this.valor;
	}
	
	public boolean esta(int val, int j) {
		boolean esta = false;
		int i = 0;
		
		if(val == Lista[i]) esta = true;
		else {
			if(i != Lista.length) esta = esta(val, i+1);		
		}
		return esta; 
	}
}
