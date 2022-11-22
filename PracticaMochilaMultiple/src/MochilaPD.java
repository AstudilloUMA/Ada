import java.util.ArrayList;

/**
 * 
 * @author ***** Jose A. Onieva *******
 *
 */
public class MochilaPD extends Mochila {
	
	public SolucionMochila resolver(ProblemaMochila pm) {
		SolucionMochila sm = new SolucionMochila();
		ArrayList<Item> items = new ArrayList<Item>();
		
		
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		
		items.add(new Item(0,0,0,0));
		items.addAll(pm.getItems());
		
		int[][] tabla = new int[items.size()][pm.getPesoMaximo()+1];
		
		rellenarTabla(tabla,items);
		
		for(int i = 0; i < items.size()-1; i++) resultado.add(0);
		
		int pesoSobrante = pm.pesoMaximo;
		int sumValor = 0;
		int i = items.size()-1;
		
		while(i > 0 && pesoSobrante > 0) {
			if(tabla[i-1][pesoSobrante] < tabla[i][pesoSobrante]) {
				resultado.set(i-1,resultado.get(i-1)+1);
				pesoSobrante -= items.get(i).peso;
				sumValor += items.get(i).valor;
				
				if(resultado.get(i-1) == items.get(i).unidades) i--;
			} else i--;
		}
		
		sm = new SolucionMochila(resultado,pm.pesoMaximo-pesoSobrante,sumValor);
		return sm;
	}
	

	
	public static void rellenarTabla(int[][] tabla, ArrayList<Item> items) {
		
		Item item; 
		int max, maxProv;
		
		for(int i = 0; i < tabla.length; i++) {
			item = items.get(i);
			max = 0;
			for(int j = 0; j < tabla[i].length; j++) {
				if(i == 0 || j == 0) tabla[i][j] = 0;
				else if(j < item.peso) tabla[i][j] = tabla[i-1][j];
				else {
					int k = 0;
					while(k <= item.unidades && j-(k*item.peso) >= 0) {
						maxProv = tabla[i-1][j-(k*item.peso)] + k*item.valor;
						if(max < maxProv) max = maxProv;
						k++;
					}
					tabla[i][j] = max;
				}
			}
		}
	}
	

}
