public class MyRunnable1 implements Runnable {
 
    public void run() {
        System.out.println("Executing thread "+Thread.currentThread().getName());
    }
     
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(new MyRunnable1(), "MyRunnable1");
        myThread.start();
    }
}