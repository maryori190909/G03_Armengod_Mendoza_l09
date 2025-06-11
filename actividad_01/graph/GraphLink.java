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

    public void insertEdge(E v1, E v2) {
        Vertex<E> vertex1 = listVertex.searchRef(new Vertex<>(v1));
        Vertex<E> vertex2 = listVertex.searchRef(new Vertex<>(v2));
        if (vertex1 != null && vertex2 != null) {
            if (!vertex1.getListAdj().search(new Edge<>(vertex2))) {
                vertex1.getListAdj().insert_Sig(new Edge<>(vertex2));
            }
            if (!vertex2.getListAdj().search(new Edge<>(vertex1))) {
                vertex2.getListAdj().insert_Sig(new Edge<>(vertex1));
            }
        }
    }

    public boolean searchVertex(E data) {
        return listVertex.search(new Vertex<>(data));
    }

    public boolean searchEdge(E v1, E v2) {
        Vertex<E> vertex1 = listVertex.searchRef(new Vertex<>(v1));
        Vertex<E> vertex2 = listVertex.searchRef(new Vertex<>(v2));
        if (vertex1 != null && vertex2 != null) {
            return vertex1.getListAdj().search(new Edge<>(vertex2));
        }
        return false;
    }

}
