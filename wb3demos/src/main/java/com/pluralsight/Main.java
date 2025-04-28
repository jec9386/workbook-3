package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        System.out.println("Hello, World!");

        FileInputStream fis = null;
        try {//needs to try anything that depends on it this code succeeding
            fis = new FileInputStream("jokes.txt");

            Scanner fileScanner = new Scanner(fis);

            //create a place to put one line at a time.
            String currentLine;

            while(fileScanner.hasNextLine()){//as long as it has a next line continue loop
                currentLine = fileScanner.nextLine();//set current line to whatever the line is.
                System.out.println(currentLine);// output it
            }

            //when you're done close it
            fileScanner.close();


        } catch (FileNotFoundException e) {
            System.out.println("There was an error with the file.");
        }



    }
}