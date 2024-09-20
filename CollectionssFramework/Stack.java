package collectionssframework;

public class Stack<T> {
    private Node<T> top;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
 
    public Stack() {
        top = null;
        size = 0;
    }

    // Push an element onto the top of the stack
    public void push(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Remove and return the top element from the stack
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T item = top.data;
        top = top.next;
        size--;
        return item;
    }

    // Return the top element without removing it
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Return the number of elements in the stack
    public int size() {
        return size;
    }

    // Clear the stack
    public void clear() {
        top = null;
        size = 0;
    }

    // Print the elements of the stack (top to bottom)
    public void print() {
        Node<T> current = top;
        System.out.print("Top -> ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("-> Bottom");
    }
}
