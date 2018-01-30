package home.local.dz4;

import java.util.Iterator;

public class TwoWayLinkedList<E>  {

    int size=0;
    Node first;
    Node last;

    public TwoWayLinkedList(){
        this.size=0;
        this.first=null;
        this.last=null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public boolean contains(E o) {
        return false;
    }

    public Iterator<E> iterator() {
        return null;
    }


    public boolean remove(E o) {
        return false;
    }


    public void clear() {

    }

    public void addFirst(E e) {
        Node newNode= new Node(e,first,null);
        first=newNode;
    size++;
    }

    public void addLast(E e) {
        Node newNode= new Node(e,null,last);
        last=newNode;
        size++;
    }

    public void addt(E e) {
        if(size==0) {
            Node newNode= new Node(e);
            first=newNode;
            last=newNode;
        } else {
            Node newNode= new Node(e,first,null);
            first=newNode;
        }
        size++;
    }

    E getFirst(){
    if(isEmpty()) return null;
     return (E) first.object;
    }

    E removeFirst(){
    if(isEmpty()) return null;
    Node temp =  first;
    first=first.previous;
    return (E) temp.object;
    }


    class LLIterator {

        // reset() - to start
        // hasNext()
        // next() - to next elem
        // getCurrent()
        // atEnd() - is at the end
        // insertAfter() - new node after current
        // insertBefore()
        // deleteCurrent()

    }
}
