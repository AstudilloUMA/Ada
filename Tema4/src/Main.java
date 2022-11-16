import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ProblCambioMonedas objeto = new ProblCambioMonedas();
        Scanner sc = new Scanner(System.in);
        int[] monedas;

        System.out.println("Introduzca la cantidad: ");
        int cantidad = sc.nextInt();

        System.out.println("Introduzca el numero de monedas: ");
        int numMonedas = sc.nextInt();
        monedas = new int[numMonedas];

        System.out.println("Introduzca las monedas: ");
        for (int i = 0; i < numMonedas; i++){
            monedas[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("El minimo numero de monedas con el que pagar es " + objeto.numMonedas(monedas,cantidad));
    }

}
