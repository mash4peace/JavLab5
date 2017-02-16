package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.BufferOverflowException;

/**
 * Created by tq1499vg on 2/15/2017.
 */
public class Filevaribales {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("Variables.txt");
        BufferedWriter bufferWriter = new BufferedWriter(writer);
        int Data = 75;
        double dblData = 98.7;
        String data = "java";
        bufferWriter.write(Data + "\n" + dblData + "\n" + data + "\n"+ 70);
        bufferWriter.close();
    }


}
