package collectionssframework;

public class Queue<T> {
  private Node<T> front;
  private Node<T> rear;
  private int size;

  private static class Node<T> {
      T data;
      Node<T> next;

      Node(T data) {
          this.data = data;
          this.next = null;
      }
  }

  public Queue() {
      front = null;
      rear = null;
      size = 0;
  }

  // Add an element to the rear of the queue
  public void enqueue(T item) {
      Node<T> newNode = new Node<>(item);
      if (isEmpty()) {
          front = newNode;
          rear = newNode;
      } else {
          rear.next = newNode;
          rear = newNode;
      }
      size++;
  }

  // Remove and return the element at the front of the queue
  public T dequeue() {
      if (isEmpty()) {
          throw new IllegalStateException("Queue is empty");
      }
      T item = front.data;
      front = front.next;
      size--;
      if (isEmpty()) {
          rear = null;
      }
      return item;
  }

  // Return the element at the front without removing it
  public T peek() {
      if (isEmpty()) {
          throw new IllegalStateException("Queue is empty");
      }
      return front.data;
  }

  // Check if the queue is empty
  public boolean isEmpty() {
      return size == 0;
  }

  // Return the number of elements in the queue
  public int size() {
      return size;
  }

  // Clear the queue
  public void clear() {
      front = null;
      rear = null;
      size = 0;
  }

  // Print the elements of the queue
  public void print() {
      Node<T> current = front;
      while (current != null) {
          System.out.print(current.data + " ");
          current = current.next;
      }
      System.out.println();
  }
}
