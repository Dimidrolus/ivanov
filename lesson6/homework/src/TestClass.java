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

            System.out.println("Result: " + Diver.div(a,b));

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
    }




public static class Diver {


    public static double div(double a, double b) {
        return a / b;
    }

}

    }



