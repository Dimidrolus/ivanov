import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by dima on 19.02.17.
 */
public class Main {

    public static void main(String[] args)
    {
        int randomizer = 30;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<10; i++)
        {
            list.add((int)(Math.random()*randomizer));
        }

        System.out.println("Print created collection:");
        for (Integer x: list)
        {
            System.out.println(x);
        }


        ArrayList<Integer> newlist = new ArrayList<>();

        for (int i=0; i<list.size(); i++)
        {
         if (list.get(i)>5)
             newlist.add(i);
        }

        System.out.println("Print indexes, which contains elements bigger then \"5\":");

        for (Integer x: newlist)
        {
            System.out.println(x);
        }

        for (int i=0; i<list.size(); i++)
        {
            int counter = 0;
            if (list.get(i)>20){
                list.remove(i+counter);
                counter--;}
        }

        System.out.println("Print list, after deleting elements bigger then \"20\":");

        for (Integer x: list)
        {
            System.out.println(x);
        }

        list.add(2,1);
        list.add(8,-3);
        list.add(5,-4);

        System.out.println("Printing collection after inserting:");

        for (int i=0; i<list.size(); i++)
        {
            System.out.println("position – " + i + ", value of element – " + list.get(i));
        }

        Collections.sort(list);

        System.out.println("Printing sorted by value collection:");

        for(Integer x: list)
        {
            System.out.println(x);
        }
    }
}
