public class Ejerc3 {

    private static int asignaturas(int[][] tablaValores, int horas){
        Integer[][] tabla = new Integer[tablaValores.length+1][horas+1];
        resolverTabla(tablaValores,1,horas, tabla);
        return tabla[1][horas];
    }

    private static void resolverTabla(int[][] tablaValores, int i, int j, Integer[][] tabla){
        if(tabla[i][j] == null){
            if(i >= tabla.length) tabla[i][j] = 0;
            else{
                int max = Integer.MIN_VALUE;
                for(int k = 0; k < j; k++){
                    resolverTabla(tablaValores,i+1,j-k,tabla);
                    if(max < (tablaValores[i][k] + tabla[i+1][j-k])) max = tabla[i+1][j-k];
                }
                tabla[i][j] = max;
            }
        }
    }
}
