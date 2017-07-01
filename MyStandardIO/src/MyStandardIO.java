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
        int favInt = 0;
        double favDouble = 0.0;
        int secondfavInt = 0;
        double secondfavDouble = 0.0;
        boolean myBoolean = false;
        short myShort = 0;
        
        // Define a InputStreamReader based on Standard Input (System.in)
        InputStreamReader isReader = new InputStreamReader(System.in);
        // Send the InputStreamReader to a BufferedReader
        BufferedReader stdin = new BufferedReader(isReader);
        
        //
        System.out.println("Enter your favorite integer:");
        favInt = Integer.parseInt(stdin.readLine());
        
        //
        System.out.println("Enter your favorite integer:");
        favInt = Integer.parseInt(stdin.readLine());
        
        //
        System.out.println("Enter your favorite integer:");
        favInt = Integer.parseInt(stdin.readLine());
        
        //
        System.out.println("Enter your favorite integer:");
        favInt = Integer.parseInt(stdin.readLine());
        
        //
        System.out.println("Enter your favorite integer:");
        favInt = Integer.parseInt(stdin.readLine());
        
        //
        System.out.println("Enter your favorite integer:");
        favInt = Integer.parseInt(stdin.readLine());
    }
}
