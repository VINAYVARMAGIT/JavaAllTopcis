class A implements Runnable{

    @Override
    public void run() {
    for (int i = 0; i < 5; i++) {
        System.out.println("Hi");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }
    }
    }
}
class B implements Runnable{

    @Override
    public void run() {
    for (int i = 0; i < 5; i++) {
        System.out.println("Hello");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }
    }
    }
}

public class MyThread {
  public static void main(String[] args) throws Exception {
    
  Thread t1 = new Thread(new A());
  Thread t2 = new Thread(new B());

    t1.start();
      try {
          Thread.sleep(10);
      } catch (InterruptedException ex) {
      }
    t2.start();

    t1.setName("1st Thread");
    System.out.println(t1.getName());
    System.out.println(t1.getPriority());
 

    //  t1.join();
    //  t2.join();//These two threads will make the main thread to wait until 
     //the t1 and t2 will complete its thread execution so don't print the
     //other stuff in betwen;
    
     //isAlive method helps us to check if the current i.e is the thread still running or not ?
     System.out.println(t1.isAlive());
     System.out.println("Hi Hello");

  }
}
