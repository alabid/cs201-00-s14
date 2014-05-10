public class CycleGraph {

    public static void main(String[] args) {
	WeightedGraph g = new MysteryWeightedGraphImplementation();
	g.addEdge(0, 1, 1);
	Iterator<Integer> iter = g.getNeighbors(0);
	while (iter.hasNext()) {
	    System.out.println(iter.next());
	}
    }
}
