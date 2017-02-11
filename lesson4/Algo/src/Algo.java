import java.util.Arrays;
import java.util.Random;

/**
 * Created by dima on 11.02.17.
 */
public class Algo
{
    public static void main (String[] args)
    {
        int max = Integer.MIN_VALUE;
        long pos = 0;
        int [] mass = new int[10];
        int ampos = 0, amneg = 0;
        Random r = new Random();


        for (int i=0; i<mass.length; i++)
        {
            mass[i] = r.nextInt();
        }


        System.out.println(Arrays.toString(mass));

        for (int i=0; i<mass.length; i++)
             {
                 if (max < mass[i])
                     max = mass[i];
             }

        System.out.println("Max value is: " + max);

        for (int i=0; i<mass.length; i++)
        {
            if (mass[i]>0)
                pos =+ mass[i];
        }
        System.out.println("The summ of positive numbers are: " + pos);

        for (int i=0; i<mass.length; i++)
        {
            if (mass[i] < 0)
                amneg++;
            else
                ampos++;

        }
        System.out.println("Amount positive numbers vs negative are: " + ampos + " vs " + amneg);
    }
}
