import java.util.Arrays;

/**
 * File Name   : MySearchDemo.java
 * Author      : Justin Luce
 * Created on  : 22-07-2017
 * Description : 
 **/
import java.util.Scanner;

public class MySearchDemo
{
    public static void main(String args[])
    {
        int[] intArray = new int[20];
        
        for (int i=0; i<intArray.length; i++) 
        {
            intArray[i] = (int) (Math.random() * 100) + 1;         
        }
        Arrays.sort(intArray);
        
        for (int i=0;i<intArray.length;i++)
        {
            System.out.println(intArray[i]);
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value you want to search for: ");
        int arrayValue = scanner.nextInt();
        
        int arrIndex = Arrays.binarySearch(intArray,arrayValue);
        
        if (arrIndex == -1)
        {
            System.out.println("The value could not be found");
        }
        else
        {
            System.out.println("The index with value "+arrayValue+" is " + arrIndex);
        }
        
        scanner.close();
    }
}
