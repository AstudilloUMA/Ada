////////////////////////////////////////////////////////////////////////////////////////////
// ALUMNO: ASTUDILLO FRAGA, PABLO
// GRUPO: SOFTWARE A
////////////////////////////////////////////////////////////////////////////////////////////

public class OrdenacionRapidaBarajada extends OrdenacionRapida {
	
	// Implementación de QuickSort con reordenación aleatoria inicial (para comparar tiempos experimentalmente)
	public static <T extends Comparable<? super T>> void ordenar(T v[]) {
		// A completar por el alumno
		barajar(v);
		ordRapidaRec(v, 0, v.length-1);
    }
	
	// reordena aleatoriamente los datos de un vector
    private static <T> void barajar(T v[]) {
    	for(int i = 0; i < v.length; i++) intercambiar(v, aleat.nextInt(v.length), i);
    } 
}
