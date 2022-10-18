/** Practica 1 PABLO ASTUDILLO FRAGA **/
public class Analizador {
    public static void main (String[] args){
        Temporizador temporizador = new Temporizador();
        // double auxTiempo[] = new double[20]; // valores de 2n
        // double auxTiempo2[] = new double[20]; // valores de n
        double auxRatio[] = new double[10];

        /** Dos temporizadores uno para 2n y otro para n**/
        for(int i=0; i<10; i++){
            double sum_auxTiempo = 0;
            double sum_auxTiempo2 = 0;
            for(int j=0; j<10; j++){ 

                temporizador.iniciar();
                Algoritmo.f(20*(i+1));
                temporizador.parar();
                // auxTiempo[j] = temporizador.tiempoPasado();
                sum_auxTiempo += temporizador.tiempoPasado();
                //System.out.println(temporizador.tiempoPasado());
                temporizador.reiniciar();

                //System.out.println("----------------------");

                temporizador.iniciar();
                Algoritmo.f(10*(i+1));
                temporizador.parar();
                // auxTiempo2[j] = temporizador.tiempoPasado();
                sum_auxTiempo2 += temporizador.tiempoPasado();
                //System.out.println(temporizador.tiempoPasado());
                temporizador.reiniciar();
            }

            auxRatio[i] = (sum_auxTiempo/10)/(sum_auxTiempo2/10);

            // System.out.println(auxRatio[i]);
        }
        //System.out.println(auxTiempo.length);
        //System.out.println(auxTiempo2.length);
        //System.out.println(auxRatio.length);
        /*double sum_aux_ratio = 0;
        for (int i=0; i<auxRatio.length;i++){
            sum_aux_ratio += auxRatio[i];
        }*/

        System.out.println(complejidad(auxRatio));
        //System.out.println("NLOGN");
    }

    public static  String complejidad(double[] array) {
    	
    	int [] rep = {0,0,0,0,0,0,0,0};
    	int max = 0;
    	
    	for(int i = 0; i < array.length; i++) {
    		
    		if (array[i] < 1.0005) {
    			
    			rep[0] ++; // 1
    			if(rep[0] >= max) max = rep[0];
    			
            } else if (array[i] > 1.0005 && array[i] <= 1.4) {
            	
                rep[1]++; // LOGN
               if(rep[1] >= max) max = rep[1];
                
            } else if (array[i] > 1.4 && array[i] < 1.6) { 
            	
                rep[2]++; // N
                if(rep[2] >= max) max = rep[2];
                
            } else if (array[i] >= 1.6 && array[i] <= 1.9) {
            	
                rep[3]++; // NLOGN
                if(rep[3] >= max) max = rep[3];
                
            } else if (array[i] >= 1.9 && array[i] <= 3.0) {
            	
            	rep[2]++; // N
            	if(rep[2] >= max) max = rep[2];
            	
            } else if (array[i] > 3.0 && array[i] <= 6.0) {
            	
                rep[4]++; // N2
                if(rep[4] >= max) max = rep[4];
                
            } else if (array[i] > 6.0 && array[i] <= 800.0) {
            	
                rep[5]++; // N3
                if(rep[5] >= max) max = rep[5];
                
            }else if (array[i]>800.0 && array[i] <= 500000 ) {
            	
                rep[6]++; // 2N
                if(rep[6] >= max) max = rep[6];
                
            }
            else{
            	
                rep[7]++; // NF
                if(rep[7] >= max) max = rep[7];
                
            }
    		//System.out.println(array[i]);
    	}
    	
    	/*for(int i = 0; i < rep.length; i++) {
    		if(rep[i] >= max) max = rep[i];
    		// System.out.println(rep[i]);	
    	}*/
  	
    	if (max == rep[0]) {
            return "1";
        } else if (max == rep[1]) {
            return "LOGN";
        } else if (max == rep[2]) { 
            return "N";
        } else if (max == rep[3]) {
            return "NLOGN";
        } else if (max == rep[4]) {
            return "N2";
        } else if (max == rep[5]) {
            return "N3";
        }else if (max == rep[6]) {
            return "2N";
        }
        else{
            return "NF";
        }
    }
}
