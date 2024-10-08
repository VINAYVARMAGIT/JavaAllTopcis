package collectionssframework;

public class LinkedList<T> {

    private Node<T> head;
    private int size;

    private static class Node<T>{
        T data;
        Node<T> next;

        public Node(T data){
            this.data=data;
            this.next=null;
        }
    }

    public void add(T data){
        Node<T> newNode = new Node<>(data);
        if (head==null) {
            head = newNode;
        }
        else {
            Node<T> current = head;
            while (current.next!=null) current =current.next;
            current.next=newNode;
        }
        size++;
    }
    public T get(int index){
        if (index<0 || index>=size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        for (int i = 0; i <index; i++) {
            current = current.next;
        }
        return current.data;
    }
    public int size(){
        return size;
    }
    public void remove(int index){
        if (index<0 || index>=size) {
            throw new IndexOutOfBoundsException();
        }
        if (index==0) {
            head = head.next;
        }
       else{
        Node<T> current = head;
        for (int i = 0; i <index; i++) {
            current = current.next;
        } 
        current.next = current.next.next;
    }
        size--;
    }
}
