/**
 * Created by dima on 14.02.17.
 */
public class TestProg {

    public static void main (String[] args)
    {
        Animal[] mass = new Animal[6];

        for (int i=0; i<3;i++)
        {
            mass[i] = new Cat();
        }

        for (int i=3; i<6;i++)
        {
            mass[i] = new Dog();
        }

        for (Animal an: mass)
        {
            an.feed();
            an.voice();
        }
    }
}
