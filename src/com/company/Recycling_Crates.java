package com.company;

/**
 * Created by Mohamed Sheikhali on 2/8/2017.
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Recycling_Crates {
    static Scanner numberScanner = new Scanner(System.in);


    public static void main(String[] args) throws IOException {
        BufferedWriter buffWritter = new BufferedWriter(new FileWriter("PerHouseCrates"));

        int numberOfHouses = 8;


        int[] cratesPerHouse = getRecyclingPerHouse(numberOfHouses);

        int totalCrates = calculateTotal(cratesPerHouse);

        int maxCrates = calculateMax(cratesPerHouse);

        int minCrates = calculateMin(cratesPerHouse);

        int houseWithMostRecycling = calculateHouseWithMostRecycling(cratesPerHouse);

        //todo add try = catch block.


        System.out.println("Total crates from all houses = " + totalCrates);
        System.out.println("Max crates at any house = " + maxCrates);
        System.out.println("Min crates at any house = " + minCrates);
        System.out.println("House with most recycling = " + houseWithMostRecycling);
        int line1 = 1;
        int count = 0;

        for (int item:cratesPerHouse) {

            buffWritter.write( "House "+count + " recycled "+item + " crates "+"\n");
            line1 ++;
            count ++;


        }
        buffWritter.close();

        numberScanner.close();


    }

    // Ask user for number of crates for each house. Store in array and return this array.
    public static int[] getRecyclingPerHouse(int houses) {
        //buffwriter = new FileWriter("Hello.txt", true);
        //bufferWitter = new BufferedWriter(writer);
        int input = 0;
        int numHouses[] = new int[houses];

        for (int i = 0; i < houses; i++) {
            System.out.println("Enter crats here : ");
            input = numberScanner.nextInt();
            numHouses[i] = input;
            //numHouses[0]++;


        }


        return numHouses;
    }

    //Add up all of the numbers in the array and return that

    public static int calculateTotal(int[] cratesPerHouse) {
        int total = 0;
        for (int i = 0; i < cratesPerHouse.length; i++) {
            total += cratesPerHouse[i];

        }


        return total;
    }

    //Which is the largest number in the array?
    public static int calculateMax(int[] cratesPerHouse) {
        int max = 0;
        for (int i = 0; i < cratesPerHouse.length; i++) {

            if (cratesPerHouse[i] > max) {
                max = cratesPerHouse[i];
            }


        }

        return max;
    }

    //Which is the smallest number in the array?
    private static int calculateMin(int[] cratesPerHouse) {
        //int numbers [] = new int[8];
        int min = cratesPerHouse[0];
        for (int i = 1; i < 8; i++) {
            if (cratesPerHouse[i] < min) min = cratesPerHouse[i];


        }
        return min;

    }

    //Use the array to figure out which house number - or array element number - has the most recycling
    public static int calculateHouseWithMostRecycling(int[] cratesPerHouse) {

        int houseNumber = 0, maxNumberOfCrates = 0;
        for(int i = 0; i < cratesPerHouse.length; i++){
            if(cratesPerHouse[i] > maxNumberOfCrates){
                maxNumberOfCrates = cratesPerHouse[i];
                houseNumber = i;
                for (int j = 0; j < cratesPerHouse.length ; j++) {
                    if(cratesPerHouse[i] == cratesPerHouse[j]){
                        houseNumber = i;
                    }


                }
            }
        }

        return houseNumber;
    }
}




