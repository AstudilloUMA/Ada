import java.util.ArrayList;

/**
 * 
 * @author ***** Pablo Astudillo Fraga ******* Asumimos que: a) Todos los items tienen
 *         un valor >=1 b) W>0
 */

public class MochilaFB extends Mochila {

	public SolucionMochila resolver(ProblemaMochila pm) {
		SolucionMochila sm= new SolucionMochila();
		sm = calcular(sm,pm.getItems(),new ArrayList<Integer>(),0, pm.pesoMaximo);
		return sm;
	}

	public SolucionMochila calcular(SolucionMochila sm, ArrayList<Item> items, ArrayList<Integer> resultado, int elem, int maxPeso){
		if(elem != items.size()){
			if(elem == 0) {
				resultado = new ArrayList<Integer>();
				for(int i = 0; i < items.size(); i++) resultado.add(0);
			}
			for(int i = 0; i <= items.get(elem).unidades; i++){
				resultado.set(elem,i);
				sm = calcular(sm,items,resultado,elem+1,maxPeso);
			}
			return sm;
		}else{
			int sumaV = 0; int sumaP = 0;
			for(int i = 0; i < resultado.size(); i++){
				sumaV += (items.get(i).valor * resultado.get(i));
				sumaP += (items.get(i).peso * resultado.get(i));
			}
			if(sm.sumaValores < sumaV && maxPeso >= sumaP){
				sm.sumaValores = sumaV;
				sm.sumaPesos = sumaP;
				sm.solucion = new ArrayList<Integer>(resultado);
			}
			return sm;
		}
	}
	
	

}
