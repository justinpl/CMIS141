import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * File Name   : ReadEmails.java
 * Author      : Justin Luce
 * Created on  : 12-08-2017
 * Description : 
 **/
public class ReadEmails 
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
            inputStream = new BufferedReader(new FileReader("C:\\Users\\jluce\\Downloads\\EmailAddresses.txt"));

            System.out.println("EmailAddresses.txt Contents");
            // Read one Line using BufferedReader
            while ((fileLine = inputStream.readLine() ) != null)
            {
                System.out.println(fileLine);
            }
        }
        catch (IOException io)
        {
            System.out.println("File IO exception" + io.getMessage());
        }
        finally
        {
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