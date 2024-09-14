
class See implements  Runnable{
    public void run(){
         System.out.println("See class " + Thread.currentThread().getName());
    }
}

public class Checking {
  public static void main(String[] args) {
    
    See s = new See();
    Thread t1 = new Thread(s);
    t1.setPriority(Thread.MAX_PRIORITY);
    Thread t2 = new Thread(s);
    t2.setName("2nd Thread");
    t1.setName("1st Thread");

    t2.start();
    t1.start();
    // System.out.println(t1.getName());
  }
}
