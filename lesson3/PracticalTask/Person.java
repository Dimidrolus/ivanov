package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

/**
 * Created by dima on 08.02.17.
 */
public class Person
{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private String name;
    private int birthYear;

   public Person(){};
    public Person(String name, int birthYear)
    {
        this.name = name;
        this.birthYear = birthYear;
    }

    public int age()
    {
        int age;
        Calendar c = Calendar.getInstance();
        age = c.get(Calendar.YEAR) - this.birthYear;
        return age;
    }

    public void input() throws IOException
    {
      System.out.println("Input Name:");
        String readMame = reader.readLine();
        this.name = readMame;

        System.out.println("Input Birth Year:");
        String syear = reader.readLine();
        int year = Integer.parseInt(syear);
        this.birthYear = year;
    }

    public void output()
    {
        System.out.println(name + "'s age is " + this.age());
    }

    public void changeName() throws IOException
    {
        System.out.println("Enter new name:");
        String readMame = reader.readLine();
        this.name = readMame;
    }

}
