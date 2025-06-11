
public class ListLinked<T> {
    private Node<T> head;

    public ListLinked() {
        head = null;
    }

     public void insert_Sig(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<T> actual = head;
        while (actual.next != null) {
            actual = actual.next;
        }
        actual.next = newNode;
    }

    public boolean search(T data) {
        Node<T> actual = head;
        while (actual != null) {
            if (actual.data.equals(data)) {
                return true;
            }
            actual = actual.next;
        }
        return false;
    }

    public T searchRef(T data) {
        Node<T> actual = head;
        while (actual != null) {
            if (actual.data.equals(data)) {
                return actual.data;
            }
            actual = actual.next;
        }
        return null;
    }


}
