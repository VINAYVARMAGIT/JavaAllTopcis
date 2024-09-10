package Collectionsss;

public class StackImplementation {
   private int [] stack;
   private int capacity;
   private int top;

   public StackImplementation(int capacity){
      this.capacity=capacity;
      stack = new int[capacity];
      top=-1;
   }
   public void push(int element){
      if (isFull()) {
         throw new StackOverflowError();
      }
      stack[++top]=element;
   }
   public boolean isFull(){
      return capacity==top;
   }
   public int pop(){
      if (isEmpty()) {
         throw new RuntimeException();
      }
      return stack[top--];
   }
   public boolean isEmpty(){
      return top == -1;
   }
   public int peek(){
      if (isEmpty()) {
         throw new RuntimeException();
      }
      return stack[top];
   }
   public int size(){
      return top+1;
   }
}

