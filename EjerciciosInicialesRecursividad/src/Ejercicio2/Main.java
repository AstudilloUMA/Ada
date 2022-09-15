package Ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n;
			
			System.out.println("Introduzca el numero a transformar: ");
			n = sc.nextInt();	
			
			Numero num = new Numero(n);
			
			System.out.println("El numero en binario es ");
			System.out.println(num.resto(n));
		}
	}
}
