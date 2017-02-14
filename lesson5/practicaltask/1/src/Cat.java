/**
 * Created by dima on 14.02.17.
 */
public class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Meow");

    }

    @Override
    public void feed() {
        System.out.println("Cats feed");

    }
}
