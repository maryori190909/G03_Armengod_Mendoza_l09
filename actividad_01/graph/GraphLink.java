import listLinked.ListLinked;
import listLinked.Node;

public class GraphLink<E> {

    protected ListLinked<Vertex<E>> listVertex;

    public GraphLink() {
        listVertex = new ListLinked<>();
    }

    public void insertVertex(E data) {
        if (!listVertex.search(new Vertex<>(data))) {
            listVertex.insert_Sig(new Vertex<>(data));
        }
    }

}
