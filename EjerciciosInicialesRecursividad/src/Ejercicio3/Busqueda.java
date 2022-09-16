package Ejercicio3;

import java.util.Arrays;

public class Busqueda {
	
	int valor;
	int [] Lista;

	public Busqueda (int val, int[] array) {
		valor = val;
		Lista = Arrays.copyOf(array, 10);
	}
	
	public int esta(int val, int j, int[] array) {
		int est = 0;
			
		if(val == array[j]) est = 1;
		else {
			if(j < array.length-1) est = esta(val, j+1, array);		
		}
		return est; 
	}
}
