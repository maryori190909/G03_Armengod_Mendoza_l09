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
public void removeEdge(E v1, E v2) {
        Vertex<E> vertex1 = listVertex.searchRef(new Vertex<>(v1));
        Vertex<E> vertex2 = listVertex.searchRef(new Vertex<>(v2));
        if (vertex1 != null && vertex2 != null) {
            vertex1.getListAdj().remove(new Edge<>(vertex2));
            vertex2.getListAdj().remove(new Edge<>(vertex1));
        }
    }

    public void removeVertex(E data) {
        Vertex<E> vertex = listVertex.searchRef(new Vertex<>(data));
        if (vertex != null) {
            Node<Vertex<E>> actual = listVertex.getHead();
            while (actual != null) {
                actual.data.getListAdj().remove(new Edge<>(vertex));
                actual = actual.next;
            }
            listVertex.remove(vertex);
        }
    }


}
