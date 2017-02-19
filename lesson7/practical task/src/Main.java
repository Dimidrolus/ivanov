import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by dima on 19.02.17.
 */
public class Main {

    public static void main(String[] args) throws IOException, IndexOutOfBoundsException
    {
        String name;
        Matcher mt;


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pt = Pattern.compile("[A-Z][a-z]+ [A-Z][a-z]+ [A-Z][a-z]+");


        do {
            System.out.println("Enter correct surname, name and fathername in format: Ivanov Ivan Ivanovich, name must contain 3-15 letters");


             name = reader.readLine();
             mt = pt.matcher(name);
        }

        while(!mt.matches());

        String[] mass = name.split(" ");

        System.out.println(mass[0] + " " +  mass[1].charAt(0) + "." + mass[2].charAt(0) + ".");
    }



}
