package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by tq1499vg on 2/15/2017.
 */
public class ReadingFiles {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("Hello.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line = bufferedReader.readLine();
        while(line != null)
        {
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();



    }
}
