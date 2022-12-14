public class asignacionTareas {
    public static List<Integer> asignacion(int[][] C) {
        Heap<List<Integer>> heap = new Heap<>();
        List<Integer> act = new ArrayList<Integer>();
        int mejor = Integer.MAX_VALUE;
        List<Integer> mejorSolucion = null;
        heap.add(act);
        while (!heap.isEmpty()) {
            act = heap.extraer(act);
            if (act.size() == C.length) {
                int m = coste(act, C);
                if (m < mejor) {
                    mejor = m;
                    mejorSolucion = act;
                    actualizar(heap, m, C);
                }
            } else {
                for (int i = 0; i < C.length; i++) {
                    if (!act.contains(i)) {
                        List<Integer> hijo = new ArrayList<Integer>(act);
                        hijo.add(i);
                        if (coste(hijo, C) < mejor) {
                            heap.add(hijo);
                        }
                    }
                }
            }
        }
        return mejorSolucion;
    }
}
