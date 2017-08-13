/**
 * File Name   : AddressBook.java
 * Author      : Justin Luce
 * Created on  : 11-08-2017
 * Description : 
 **/
import java.util.Scanner;

public class AddressBook 
{

    // Class variables
    private static String name = "John Doe";
    private static int age = 42;
    private static int zipCode = 21321;

    public static void main(String[] args) 
    {
        Scanner myScanner = new Scanner(System.in);
        // Prompt user to enter their name
        while (true) 
        {
            System.out.println("Enter you name (e.g. John Smith): ");
            name = myScanner.nextLine();
            // Check to make sure name has some characters 
            if (name.trim().length() > 0) 
            {
                break;
            }
        } // End while loop

        // Prompt use to enter their Age
        while (true) 
        {
            try 
            {
                System.out.println("Enter your age (e.g. 32): ");
                age = Integer.parseInt(myScanner.next());
                break;
            } 
            catch (NumberFormatException ne) 
            {
                System.err.println("NumberFormatException: "
                        + ne.getMessage());
                System.out.println("Please enter a valid age: ");
            }
        } // End while loop

        // Prompt use to enter their Zip
        while (true) 
        {
            try 
            {
                System.out.println("Enter your zip code (e.g. 21932): ");
                zipCode = Integer.parseInt(myScanner.next());
                break;
            } 
            catch (NumberFormatException ne) 
            {
                System.err.println("NumberFormatException: "
                        + ne.getMessage());
                System.out.println("Please enter a valid zip code: ");
            }
        } // End while loop
        // Display results
        System.out.println("Thank you " + name + "!");
        System.out.println("Your age is " + age + ".");
        System.out.println("Your zip code is " + zipCode + ".");

    }

}
