package home.local.dz4;

public class Node<T> {

    public Node next;
    public Node previous;
    T object;

    public Node(T object) {
        this.object = object;
        this.next = null;
        this.previous = null;
    }

    public Node(T object, Node previous, Node next) {
        this.next = next;
        this.previous = previous;
        this.object = object;
    }

}
