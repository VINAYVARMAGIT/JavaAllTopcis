public class SynchronizedExample {
    public synchronized void synchronizedMethod() {
        System.out.println(Thread.currentThread().getName() + " entered the method");
        try {
            Thread.sleep(2000); // Simulate some  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " exiting the method");
    }

    public static void main(String[] args) {
        SynchronizedExample example = new SynchronizedExample();
        
        Thread t1 = new Thread(() -> example.synchronizedMethod(), "Thread-1");
        Thread t2 = new Thread(() -> example.synchronizedMethod(), "Thread-2");

        t1.start();
        t2.start();
    }
}
