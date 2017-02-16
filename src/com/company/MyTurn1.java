package com.company;

import java.io.*;

/**
 * Created by tq1499vg on 2/15/2017.
 */
public class MyTurn1 {
    public static void main(String[] args) throws IOException {
            FileWriter writer = new FileWriter("Mydetails.txt");
            BufferedWriter bufWriter = new BufferedWriter(writer);
            bufWriter.write("Name : Mohamed Sheikhali\n");
            bufWriter.write("favorite Colotr : Blue\n");
            bufWriter.write("Class Code : java 2545\n");
            bufWriter.close();
            BufferedReader reader1 = new BufferedReader(new
                    FileReader("Mydetails.txt"));
            String line = reader1.readLine();
            while(line != null){
                System.out.println(line);
                line = reader1.readLine();
            }
            reader1.close();






    }

}
