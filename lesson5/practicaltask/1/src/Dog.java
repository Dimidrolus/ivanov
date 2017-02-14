/**
 * Created by dima on 14.02.17.
 */
public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Gav");
    }

    @Override
    public void feed() {
        System.out.println("Dogs feed");

    }
}
