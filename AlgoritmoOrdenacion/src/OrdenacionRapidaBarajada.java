////////////////////////////////////////////////////////////////////////////////////////////
// ALUMNO: ASTUDILLO FRAGA, PABLO
// GRUPO: SOFTWARE A
////////////////////////////////////////////////////////////////////////////////////////////

public class OrdenacionRapidaBarajada extends OrdenacionRapida {
	
	// Implementaci�n de QuickSort con reordenaci�n aleatoria inicial (para comparar tiempos experimentalmente)
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