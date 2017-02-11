import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by dima on 11.02.17.
 */
public class Enum

{
    public static void main (String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Continents cont = null;

        System.out.println("Enter country or city)");

        String contic = reader.readLine();

        switch (contic)
        {
            case "Zimbabve" : case "Gulu" :case "Egypt":
            cont = Continents.Africa; break;
            case "Sidney" : case "Nauru" :case "Zelland":
            cont = Continents.Australia; break;
            case "Ukraine" : case "Parassha" :case "Poland":
            cont = Continents.Europe; break;
            case "USA" : case "Brazil" :case "Mexico":
            cont = Continents.America; break;
            case "China" : case "Japan" :case "Korea":
            cont = Continents.Asia; break;
            default:
                System.out.println("May be you're live in antarktida?");




        }

        System.out.println(cont);

    }

}
