/**
 * Created by dima on 22.02.17.
 */
public class Exthread  extends Thread{

    private int iteration;
    private boolean start;
    Exthread (int iteration, boolean start)
    {
        this.iteration = iteration;
        this.start = start;
    }


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Starts");
        new Parametred(iteration, start).start();
    }
}
