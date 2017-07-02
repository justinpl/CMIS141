/**
 * File Name   : MyStandardIO.java
 * Author      : Justin Luce
 * Created on  : 01-07-2017
 * Description : 
 **/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MyStandardIO
{
    public static void main(String[] args) throws IOException
    {
        // Variables to hold values
        byte myAgeByte = 0;
        float myLatFlt = 0;
        float myLongFlt = 0;
        long myStarLong = 0; 
        short myMaxShort = 0;
        boolean myBoolean = false;
        
        // Define a InputStreamReader based on Standard Input (System.in)
        InputStreamReader isReader = new InputStreamReader(System.in);
        // Send the InputStreamReader to a BufferedReader
        BufferedReader stdin = new BufferedReader(isReader);
        
        // Prompt and store the users age
        System.out.println("Enter your age:");
        myAgeByte = Byte.parseByte(stdin.readLine());
        
        // Prompt and store the users latitude
        System.out.println("Enter your address latitude:");
        myLatFlt = Float.parseFloat(stdin.readLine());
        
        // Prompt and store the users longitude
        System.out.println("Enter your address longitude:");
        myLongFlt = Float.parseFloat(stdin.readLine());
        
        // Prompt and store number of stars
        System.out.println("Enter how many stars there are in our galaxy?:");
        myStarLong = Long.parseLong(stdin.readLine());
        
        // Prompt and store the maximum value java can store
        System.out.println("What is the maximum value Java can store as a short?:");
        myMaxShort = Short.parseShort(stdin.readLine());
        
        // Ask the user if they're stressed
        System.out.println("Are you stressed out?:");
        myBoolean = Boolean.parseBoolean(stdin.readLine());
        
        // Print the results to verify your data
        System.out.println("Your age is: " + myAgeByte);
        System.out.println("Your latitiude is: " + myLatFlt);
        System.out.println("Your longitude is: " + myLongFlt);
        System.out.println("There are " + myStarLong + " stars in our galaxy.");
        System.out.println("The maximum value a short can hold is: " + myMaxShort);
        System.out.println("Are you stressed out?: " + myBoolean);
    }
}
