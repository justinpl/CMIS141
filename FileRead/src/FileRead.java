import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * File Name   : FileRead.java
 * Author      : Justin Luce
 * Created on  : 12-08-2017
 * Purpose: This program demonstrates
 * reading data from files
*/

public class FileRead 
{
    public static void main(String[] args) 
    {
        Scanner scannerIn = null;
        FileInputStream in = null;   
        BufferedReader inputStream = null;
        
        // int equivalent of the char
        int fileChar;
        String fileLine;
        try 
        {
            // Use of FileInputStream
            in = new FileInputStream("C:\\Users\\jluce\\Downloads\\ReadIt.txt");  
            
            System.out.println("ReadIt File Contents");
            // Read one char at a time
            while ((fileChar = in.read()) != -1) 
            {
                // convert int to char
                System.out.print((char) fileChar);
            }
            // Separate the file output
            System.out.println("");
            
            System.out.println("Numbers.txt File Contents");
            // Use of Scanner and BufferedReader
            inputStream =  new BufferedReader(new FileReader("C:\\Users\\jluce\\Downloads\\Numbers.txt"));
            scannerIn = new Scanner(inputStream);
            while (scannerIn.hasNext()) 
            {
                if (scannerIn.hasNextInt()) 
                {
                    System.out.println(scannerIn.nextInt());
                }
                if (scannerIn.hasNextDouble()) 
                {
                    System.out.println(scannerIn.nextDouble());
                } 
                else 
                {
                    scannerIn.next();
                }   
            }
            
            // Separate the file output
            System.out.println("");
            // Use of 
            inputStream = new BufferedReader(new FileReader("C:\\Users\\jluce\\Downloads\\Strings.txt"));

            System.out.println("Strings.txt Contents");
           // Read one Line using BufferedReader
            while ((fileLine = inputStream.readLine() ) != null) {
                System.out.println(fileLine);
            }
        }  
        catch (IOException io) 
        {
            System.out.println("File IO exception" + io.getMessage());

        } 
        finally 
        {
            // Need another catch for closing 
            // the streams          
            try 
            {
                // Close the streams
                if (in != null) 
                {
                    in.close();
                }
                if (inputStream != null) 
                {
                inputStream.close();
            }
                
            } 
            catch (IOException io) 
            {
                System.out.println("Issue closing the Files" + io.getMessage());
            }
        }

    }
}
