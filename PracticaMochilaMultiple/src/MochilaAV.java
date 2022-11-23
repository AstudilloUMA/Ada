import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ***** Pablo Astudillo Fraga *******
 *
 */
public class MochilaAV extends Mochila {

	public SolucionMochila resolver(ProblemaMochila pm) {
		ArrayList<Item> items = new ArrayList<Item>();

		items.addAll(pm.getItems());

		Collections.sort(items, new Comparator<Item>() {
			@Override
			public int compare(Item i1, Item i2) {
				return Double.compare(((double) i2.valor/i2.peso), ((double) i1.valor/i1.peso));
			}
		});

		int pesoSobrante = pm.pesoMaximo;
		int sumaTotal = 0;

		int[] cantidades = new int[items.size()];

		int i = 0;
		while(i < items.size() && pesoSobrante > 0) {
			Item it = items.get(i);
			while (cantidades[it.index] < it.unidades && it.peso <= pesoSobrante) {
				cantidades[it.index]++;

				pesoSobrante -= it.peso;
				sumaTotal += it.valor;
			}
			i++;
		}

		return new SolucionMochila(cantidades, pm.pesoMaximo - pesoSobrante, sumaTotal);
	}
}
