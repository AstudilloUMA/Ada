public class Ejercicio1 {

    public static int encontrar (int [] a, int inf, int sup){
        int num = -1;
        int m = (inf + sup) / 2;
        if(inf <= sup) {
            if (a[m] == m) num = m;
            else if (a[m] < m) num = encontrar(a,m+1,sup);
            else num = encontrar(a,inf,m-1);
            if (inf == 0 && sup == a.length && num == -1) {
                num = encontrar(a,m+1,sup);
            }
        }
        return num;
    }

    public static void main(String[] args) {

        int array [] = {1,2,3,4,4,6,6};
        for(int i = 0; i < array.length; i++) System.out.println(array[i] + " " + i);
        int num = encontrar(array,0, array.length);
        if(num != -1) System.out.println("El numero que se encuentra en su posición es el " + num);
        else System.out.println("No hay ningun numero que se encuentre en su posicion");

    }




}
