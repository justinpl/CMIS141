/**
 * File Name   : MySelectionIfDemo.java
 * Author      : Justin Luce
 * Date        : Jul 2, 2017
 * Description : This program demonstrates the use of if/else selection statements.
 */

// Import statements
import java.util.Scanner;

public class MySelectionIfDemo
{
    public static void main(String[] args)
    {
        // Declare variables
        float income = 0;
        float tax = 0.0f;
        
        // Use the Scanner class to input data
        Scanner scannerIn = new Scanner(System.in);
        
        // the nextInt() method scans the next int value
        System.out.println("Enter your total income:");
        income = scannerIn.nextFloat(); 
        
        // Display what income was entered
        System.out.println("The following ammount was entered " + income);
        
        // verify income is greater than 0
        if (income < 0)
        {
            System.out.println("Income must be greater than zero");
            System.exit(0);
        }
        // determine tax based on income
        else if (income < 20000)
        {
            tax = 0.10f;
        }
        else if ((income >= 20000) & (income < 40000))
        {
            tax = 0.12f;
        }
        else if ((income >= 40000) & (income < 60000))
        {
            tax = 0.14f;
        }
        else 
        {
            tax = 0.15f;
        }
        System.out.println("Your income is $" + income);
        System.out.println("Your tax rate is " + tax + " percent");
        System.out.println("You owe $" + (income * tax) + " in taxes");
    }   
}
