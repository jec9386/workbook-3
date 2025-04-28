package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("jokes.txt");
            BufferedReader br = new BufferedReader(fr);

            String currentLine;
            while((currentLine = br.readLine()) != null){//take value from br and assing to currentLine and see if that value is not null.
                System.out.println(currentLine);
            }

            br.close();

        } catch (IOException e){
            System.out.println("oh no! ");
        }

        }



    }

