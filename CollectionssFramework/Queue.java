package CollectionssFramework;

import javax.management.RuntimeErrorException;

public class Queue {
   private int[] queue;
   private int front;
   private int rear;
   private int size;
   private int capacity;

   public Queue(int capacity){
    this.capacity=capacity;
    queue = new int[capacity];
    front =0;
    rear=-1;
    size=0;
   }

   public void enqueue(int element){
    if (isFull()) {
        throw new RuntimeException("Queue is Full");
    }
     rear = (rear+1)%capacity;
     queue[rear]=element;
     size++;
   }
   public boolean isFull(){
    return size==capacity;
   }
   public int dequeue(int element){
    if (isEmpty()) {
        throw new RuntimeException("Queue is Empty");
    }
    int removedElement =queue[front];
     front =(front+1)%capacity;
     size--;
     return removedElement;
   }
   public boolean isEmpty(){
    return size==0;
   }
}
