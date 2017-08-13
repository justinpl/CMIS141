import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * File Name   : WriteEmails.java
 * Author      : Justin Luce
 * Created on  : 12-08-2017
 * Description : 
 **/
public class WriteEmails
{
    public static void main(String[] args) 
    {
        BufferedReader inputStream = null;
        BufferedWriter outputStream = null;
        
        String fileLine;
        
        try 
        {
            inputStream = new BufferedReader(new FileReader("C:\\Users\\jluce\\Downloads\\EmailAddresses.txt"));
            // Open Copy Output file

            outputStream = new BufferedWriter(new FileWriter("C:\\Users\\jluce\\Downloads\\EmailCopy.txt"));
            
            System.out.println("Email Addresses:");
            // Read one Line using BufferedReader
            while ((fileLine = inputStream.readLine()) != null) 
            {
                 outputStream.write(fileLine + "\r\n");
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
                if (outputStream != null) 
                {
                    outputStream.close();
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

