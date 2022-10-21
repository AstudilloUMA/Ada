import java.util.Random;

////////////////////////////////////////////////////////////////////////////////////////////
// ALUMNO:
// GRUPO:
////////////////////////////////////////////////////////////////////////////////////////////

public class OrdenacionRapida extends Ordenacion {
  
	public static <T extends Comparable<? super T>> void ordenar(T v[]) {
	    ordRapidaRec(v, 0, v.length-1);
	}

	// Debe ordenar ascendentemente los primeros @n elementos del vector @v con 
	// una implementación recursiva del método de ordenación rápida.	
	public static <T extends Comparable<? super T>> void ordRapidaRec(T v[], int izq, int der) {
		
		if (izq < der){
			int p = partir(v,v[0],izq,der);
			ordRapidaRec(v,izq,p-1);
			ordRapidaRec(v,p+1,der);
		}
	}
	   
   public static <T extends Comparable<? super T>> int partir(T v[], T pivote, int izq, int der) {
	   
	   int z = 0;
	   int i = izq;
	   int j = der;
	   int index = -1;
	   
	   while(index < 0) {
		   if(v[z] == pivote) index = z;
		   else z++;
	   }
	   
	   if(index == izq) i++;
	   else if(index == der) j--;
	    
	   do {
		   while (i <= j && v[i].compareTo(pivote) <= 0){ i++;}
		   while (i <= j && v[j].compareTo(pivote) > 0){ j--;}
		   if(i < j) intercambia(v,i,j);
		   
	   }while(i <= j);
	   
	   intercambia(v,index,j);
	   
	   return j;   	
   }
   
   public static <T extends Comparable<? super T>> void intercambia (T v[], int i, int j) {
	   T aux = v[i];
	   v[i] = v[j];
	   v[j] = aux;
   }

	// Pequeños ejemplos para pruebas iniciales.
	public static void main (String args[]) {
	
		// Un vector de enteros
		Integer vEnt2[] = new Integer[20] ;
		int num;
		Random random_method = new Random();
		for(int i = 0; i < vEnt2.length; i++){
			num = random_method.nextInt(100);
			vEnt2[i] = num;
		}
		ordenar(vEnt2);
		System.out.println(vectorAString(vEnt2));
		
		Integer vEnt[] = {3,8,6,5,2,9,1,1,4};
		ordenar(vEnt);
		System.out.println(vectorAString(vEnt));

		// Un vector de caracteres
		Character vCar[] = {'d','c','v','b'};
		ordenar(vCar);
		System.out.println(vectorAString(vCar));

	}	
    
}
