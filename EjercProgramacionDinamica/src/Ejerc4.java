public class Ejerc4 {

    //Botom-Up para rellenar la tabla

    public int embarcaderos(int[][] tarifa, int ini, int fin){

        int n = tarifa.length;
        int [][] B = new int [n][n];

        for(int i = n-1; i >= 0; i--){
            for(int j = i; j <= n-1; j++){
                if(i == j) B[i][j] = 0;
                else if(i < j){
                    int mejor = B[i+1][j] + tarifa[i][i+1];
                    for(int k = i+2; k <= j; k++){
                        int opcional = B[k][j] + tarifa[i][k];
                        if(mejor > opcional){
                            mejor = opcional;
                        }
                    }
                }

            }
        }



        return B[ini][fin];
    }





}
