/**
 * Created by dima on 21.02.17.
 */
public class Test {
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new Tready(), "Thread 1");
        Thread t2 = new Thread(new Tready(), "Thread 2");
        Thread t3 = new Thread(new Tready(), "Thread 3");
         t1.start();
         t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         t3.start();




    }
}
