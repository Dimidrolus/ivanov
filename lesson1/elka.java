package com.javarush.test.level08.lesson08.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dima on 03.02.17.
 */
public class elka
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of floors");
        String as = reader.readLine();
        int a = Integer.parseInt(as);

        char space = '\u0020';

        char star = '*';

        int counter = 1;

        for (int i=a; i>0; i--)
        {
            for (int b=(i*2)-2; b>0; b--)
            {
                System.out.print(space);
            }
            for (int c=0; counter>c; c++)
            {
                System.out.print(star + " ");
            }
            counter=counter+2;
            System.out.println();

        }




    }
}