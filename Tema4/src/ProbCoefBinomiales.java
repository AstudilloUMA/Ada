public class ProbCoefBinomiales {
    public static int coefBinomialPD(int n, int k){
        int[][] tabla = new int[n+1][];

        for(int i = 0; i <= n; i++){
            tabla[i] = new int[i+1];

            for(int j = 0; j <= i; j++){
                if(j <= k){
                    if(j == 0 || j == i) tabla[i][j] = 1;
                    else tabla[i][j] = tabla[i-1][j-1] + tabla[i-1][j];
                }
            }
        }

        return tabla[n][k];
    }
}
