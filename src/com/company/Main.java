package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args)throws IOException {
        FileWriter writer = new FileWriter("Hello.txt");
        BufferedWriter bufferWitter = new BufferedWriter(writer);
        bufferWitter.write("Hello\n");
        bufferWitter.write("World\n");
        bufferWitter.close();
        writer = new FileWriter("Hello.txt", true);
        bufferWitter = new BufferedWriter(writer);
        bufferWitter.write("AddMore\n");
        bufferWitter.close();


    }
}
