package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) throws IOException{

        Person[] mass = new Person[5];


        for (int i=0; i<mass.length; i++)
        {
            mass[i] = new Person();
        }

        mass[0].input();

        mass[0].output();


    }
}
