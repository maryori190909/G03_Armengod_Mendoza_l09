
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
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

}
