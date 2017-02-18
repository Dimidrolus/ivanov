import sun.jvm.hotspot.StackTrace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


/**
 * Created by dima on 18.02.17.
 */
public class TestClass {

    public static void main (String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        try {
            System.out.println("Input first number");
            double a = Double.parseDouble(reader.readLine());
            System.out.println("Input second number");
            double b = Double.parseDouble(reader.readLine());

            System.out.println("Result: " + Algo.div(a,b));

        } catch (IOException e) {
            e.printStackTrace();

        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }

        catch (NumberFormatException e)
        {
            e.printStackTrace();
        }


        try
        {
            System.out.println(Algo.readNumber(20, 18));
        }

        catch (RangeException e)
        {
            e.printStackTrace();
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }



    }




public static class Algo {


    public static double div(double a, double b) {
        return a / b;
    }

    public static boolean readNumber(int start, int end) throws IOException, RangeException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number to check: ");
        int c = Integer.parseInt(reader.readLine());

        if (!(start<end)) {
            throw new RangeException("Set correct parameters!");
        }

        if (!(c> start) | !(c<end))
            return false;
        else
            return true;
    }
}

    }



