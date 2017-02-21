/**
 * Created by dima on 21.02.17.
 */
public class Tready implements Runnable {
    @Override
    public void run() {
        for (int i=0; i<5; i++)
        {
            System.out.println("Running" + Thread.currentThread().getName());
        }
    }
}
