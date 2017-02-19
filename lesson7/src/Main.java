import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dima on 19.02.17.
 */
public class Main {

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter substring and string:");
        String string1 = reader.readLine();
        String string2 = reader.readLine();

        System.out.println(string2.toLowerCase().contains(string1.toLowerCase()));





    }
}
