package Ejercicio3;

import java.util.Scanner;

public class Main {
	
	public static int esta(int val, int j, int[] array) {
		int est = 0;
			
		if(val == array[j]) est = 1;
		else {
			if(j < array.length-1) est = esta(val, j+1, array);		
		}
		return est; 
	}

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int val; 
			int[] array = {1,2,3,4,5,6,7,8,9,10};
				
			System.out.println("Introduzca el valor a buscar: ");
			val = sc.nextInt();
			
			if(esta(val, 0,array) == 1) System.out.println(val + " si se encuentra en el array");
			else System.out.println(val + " no se encuentra en el array");
		}
	}

}
