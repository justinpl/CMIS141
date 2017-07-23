/**
 * File Name   : MyArrayDemo.java
 * Author      : Justin Luce
 * Created on  : 22-07-2017
 * Description : 
 **/
public class MyArrayDemo
{
    public static void main(String[] args)
    {
        int x = -50;
        // Create array of ints
        int[] intArray = new int[101];
        // Create array of bools
        boolean[] boolArray = new boolean[100];
        
        for (int i=0; i<intArray.length; i++)
        {
            intArray[i] = x;
            x++;
        }
        for (int i=0; i<boolArray.length; i++)
        {
            boolArray[i] = Math.random() < 0.5;
        }
        for (int i=0; i<intArray.length; i++) 
        {
            // Print new line every 10 items
            if ((i % 10)==0  ) 
            {
                System.out.println("");
            }
            System.out.print(intArray[i] +"\t");
        }
        for (int i=0; i<boolArray.length; i++) 
        {
            // Print new line every 10 items
            if ((i % 10)==0  ) 
            {
                System.out.println("");
            }
            System.out.print(boolArray[i] +"\t");
        }
    }
}
