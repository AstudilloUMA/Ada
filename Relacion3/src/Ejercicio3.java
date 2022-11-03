public class Ejercicio3 {
    
    public static int contar (int [] v, int inf, int sup, int num){
        int veces = 0;
        if (inf == sup && v[inf] == num) veces++;
        else if (inf < sup) {
            int m = (inf + sup)/ 2;
            veces += contar(v,inf,m-1,num);
            veces += contar(v,m,sup-1,num);
        }
        return veces;
    }

    public static void main(String[] args) {
        int a[] = {1,3,2,4,2,2,3,2,2,2};
        Integer mayoritario = null;
        for(int i = 0; i < a.length; i++){
            if(contar(a,0,a.length-1,a[i]) > a.length/2){
                mayoritario = a[i];
            }
            System.out.println(a[i] + " " + contar(a,0,a.length-1,a[i]));
        }
        if(mayoritario != null) System.out.println ("El elemento mayoritario es " + mayoritario);
        else System.out.println("No hay elemento mayoritario");
    }
    
    
}
