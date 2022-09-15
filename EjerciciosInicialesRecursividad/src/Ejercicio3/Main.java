package Ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			
			int val; 
			int[] array = {1,2,3,4,5,6,7,8,9,10};
			
			System.out.println("Introduzca el valor a buscar: ");
			val = sc.nextInt();
			
			Busqueda bus = new Busqueda(val,array);
			
			if(bus.esta(val, 0)) System.out.println(val + " si se encuentra en el array");
			else System.out.println(val + " no se encuentra en el array");
			
		}

	}

}
