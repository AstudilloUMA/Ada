import java.util.ArrayList;

public class ProblCambioMonedas {
     public int numMonedas(int[] mon, int cant){
         int[][] C = new int[mon.length][cant+1];

         for(int i = 0; i < mon.length; i++) C[i][0] = 0;

         for(int i = 0; i < mon.length; i++){
             for(int j = 1; j < (cant+1); j++){
                 if(i == 0 && j<mon[0]) C[i][j] = -1;
                 else if(i == 0) C[i][j] = suma(1,C[i][j-mon[0]]);
                 else if(j < mon[i]) C[i][j] = C[i-1][j];
                 else C[i][j] = minimo(C[i-1][j],suma(1,C[i][j-mon[i]]));
             }
         }
         return C[mon.length-1][cant];
     }

     public int suma(int x, int y){
         if( y != -1 && x != -1) return x + y;
         else return -1;
     }

     public int minimo (int x, int y){
         if(x != -1 && y != -1) return Math.min(x,y);
         else if(x != -1) return x;
         else if(y != -1) return y;
         else return -1;
     }
}
