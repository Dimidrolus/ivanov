package Documents.git.ivanov.lesson3.example;



/**
 * Created by dima on 06.02.17.
 */
public class Example
{
    public static void Main (String [] args)
    {
        Student stud1 = new Student("Petro", 8);
        Student stud2 = new Student("Katuha", 11);
        Student stud3 = new Student("Dimonchik", 4);

        Student [] mass = new Student[] {stud1, stud2, stud3};

        for (Student studentik: mass)
        {
            System.out.println(studentik);
        }


        System.out.println("Avarage Rating is " + Student.getAvgRating() );
    }


}
