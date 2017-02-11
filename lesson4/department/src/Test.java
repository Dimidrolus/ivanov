import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dima on 11.02.17.
 */
public class Test
{
    public static void main (String[] args) throws IOException, NullPointerException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        Employee[] mass = new Employee[5];

        for (int i=0; i<mass.length; i++)
        {
            mass[i] = new Employee();
        }

        mass[0].department = Department.CEO;
        mass[0].name = "Petro";
        mass[1].department = Department.Driver;
        mass[1].name = "Oleg";
        mass[2].department = Department.Technic;
        mass[2].name = "Radomir";
        mass[3].department = Department.CEO;
        mass[3].name = "Vovanchik";
        mass[4].department = Department.ITdep;
        mass[4].name = "Dimonchik";

        for (int i=0; i<mass.length; i++)
        {
            mass[i].salary = (i+20)*100;
        }

        System.out.println("Please enter department which workers you want do display:");
        String dep = reader.readLine();



        for (int i=0; i<mass.length; i++)
        {
            if (mass[i].department.toString().equals(dep) )
            {
                System.out.println(mass[i].name);
            }
        }

        System.out.println("Sorted by salary:");

        while (true)
        {
         boolean finish = true;
            Employee helper;
            for (int i=0; i<mass.length-1; i++ )
            {
                if (mass[i].salary > mass[i+1].salary)
                {
                    mass[i] = helper = null;
                    mass[i] = mass[i+1];
                    mass[i+1] = helper;
                    finish = false;
                }

            }
            if (finish)
                break;
        }

        for(Employee x: mass)
        {
            System.out.println(x.name);
        }




    }
}
