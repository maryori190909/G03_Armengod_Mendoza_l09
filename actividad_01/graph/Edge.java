public class Edge<E> {
    private Vertex<E> refDest;
    private int weight;

    public Edge(Vertex<E> refDest) {
        this.refDest = refDest;
        this.weight = -1;
    }
}
