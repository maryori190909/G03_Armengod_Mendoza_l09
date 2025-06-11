import listLinked.ListLinked;

public class Vertex <E> {
    private E data;
    protected ListLinked<Edge<E>> listAdj;

    public Vertex(E data){
        this.data = data;
        listAdj = new ListLinked();
    }

    public E getData() {
        return data;
    }

    public ListLinked<Edge<E>> getListAdj() {
        return listAdj;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Vertex<?>) {
            Vertex<?> v = (Vertex<?>) o;
            return this.data.equals(v.data);
        }
        return false;
    }

}
