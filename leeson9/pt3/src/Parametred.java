/**
 * Created by dima on 22.02.17.
 */
public class Parametred extends Thread {

    private int iteration;
    private boolean start;

    Parametred(int iteration, boolean start) {
        this.iteration = iteration;
        this.start = start;
    }

    @Override
    public void run() {
        for (int i = 0; i < iteration; i++) {
            System.out.println(Thread.currentThread().getName() + "starts");
        }
        if (start) {
            new Parametred(5, false).start();
        }
    }
}
