import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dima on 19.02.17.
 */
public class Main {

    public static void main(String[] args)
    {
        int randomizer = 10;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<10; i++)
        {
            list.add((int)(Math.random()*randomizer));
        }

        for (Integer x: list)
        {
            System.out.println(x);
        }


        System.out.println();

        ArrayList<Integer> newlist = new ArrayList<>();

        for (int i=0; i<list.size(); i++)
        {
         if (list.get(i)>5)
             newlist.add(i);
        }

        for (Integer x: newlist)
        {
            System.out.println(x);
        }

    }
}
