package Tema1;

import java.util.Scanner;

public class Ejercicio8{

    public static boolean haySuma (int[] a, int x){
        boolean suma = false;
        int i = 0;
        while (suma == false && i < a.length){
        	int j = i;
            while(suma == false && j < a.length){
                if((a[i] + a[j]) == x) suma = true;
                else j++;
            }
            i++;
        }
        return suma;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int suma;
        int array[] = {1,2,3,3,4,6,8,10};
        System.out.println("Introduzca la suma que quiere saber: ");
        suma = sc.nextInt();
        if(haySuma(array, suma)) System.out.println("Si se halla la suma");
        else System.out.println("No se halla la suma");
        sc.close();
       
    }
    
}