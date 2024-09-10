package CollectionssFramework;
import java.lang.*;
public class DoubleLinkedList <T>{

   private Node<T> head;
   private Node<T> tail;
   private int size;

   private class Node<T>{
    Node<T> prev;
    Node<T> next;
    T data;

    public Node(T data){
       this.prev=null;
       this.next=null;
       this.data=data;
    }
   }
   public DoubleLinkedList(){
    this.head= null;
    this.tail=null;
    this.size=0;
}

public void add(T data){
    Node<T> newNode = new Node<>(data);
    if (head== null) {
        head= newNode;
        tail= newNode;
    }
    else{
        tail.next = newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    size++;
}
public void addFirst(T data){
    Node<T> newNode = new Node<>(data);
    if (head== null) {
        head= newNode;
        tail= newNode;
    }else{
       newNode.next= head;
       head.prev= newNode;
       head = newNode;
    }
    size++;
}
public void removeLast(){
    if (tail==null) return;
    if (head== tail) {
        head= null;
        tail= null;
    }else{
        tail = tail.prev;
        tail= null;
    }
    size--;
}
public void removeFirst(){
    if (head==null) return;
    if (head== tail) {
        head= null;
        tail= null;
    }else{
        head = head.next;
        head= null;
    }
    size--;
}
public void remove(T data){
    if (head==null) return;

    Node<T> current =new Node<>(data);
    while (current!=null) {
        if (current.data.equals(data)) {
            if (current==head) {
               removeFirst(); 
            }else if (current==tail) {
                removeLast();
            }else{
                current.prev.next= current.next;
                current.next.prev=current.prev;
                current=null;
                size--;
            }
            return;
        }
        current=current.next;
    }
}
public void printForward(){
    Node<T> current = head;
    while (current!=null) {
        System.out.println(current.data+" ");
        current=current.next;
    }
    System.out.println("");
}
public void printBackward(){
    Node<T> current = tail;
    while (current!=null) {
        System.out.println(current.data+" ");
        current=current.prev;
    }
    System.out.println("");
}
public int size(){
    return size;
}
}
