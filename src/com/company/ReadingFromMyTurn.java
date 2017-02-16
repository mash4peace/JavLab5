package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by tq1499vg on 2/15/2017.
 */
public class ReadingFromMyTurn {
    public static void main(String[] args)throws IOException {
        FileReader reader = new FileReader("Mydetails.txt");
        BufferedReader bufReader = new BufferedReader(reader);
        String line = bufReader.readLine();

    }

}
