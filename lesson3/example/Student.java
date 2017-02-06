package com.javarush.test.level09.lesson11.home09;

/**
 * Created by dima on 06.02.17.
 */
public class Student
{
    private static int avgRating;
    private String name;
    private int rating;

   public Student ()
    {

    }

    public Student (String name, int rating)
    {
        this.name = name;
        this.rating = rating;
        Student.avgRating = Student.avgRating + rating;
    }

    public static boolean betterStudent (Student stud1, Student stud2)
    {
        boolean bet;
        if (stud1.rating > stud2.rating)
            bet = true;
        else
            bet = false;

        return bet;
    }

    public void changeRating (int rating)
    {
        Student.avgRating = Student.avgRating - this.rating;
        this.rating = rating;
        Student.avgRating = Student.avgRating + this.rating;

    }

   @Override

    public String toString()
   {
       return "Student name is " + this.name + " and his rating is " + this.rating;
   }

}
