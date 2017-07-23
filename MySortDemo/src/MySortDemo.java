import java.util.Arrays;

/**
 * File Name   : MySortDemo.java
 * Author      : Justin Luce
 * Created on  : 22-07-2017
 * Description : 
 **/
public class MySortDemo
{
    public static void main(String[] args)
    {
        float [] floatArray = new float[50];
        
        for (int i=0; i<floatArray.length; i++) 
        {
            floatArray[i] = (float) (Math.random() * 100);
        }
        // Print the unsorted array
        for (int i=0; i<floatArray.length; i++) 
        {
            System.out.println(floatArray[i]);         
        }
        Arrays.sort(floatArray);
        System.out.println("*****************************");
        // Print the sorted array
        for (int i=0; i<floatArray.length; i++) 
        {
            System.out.println(floatArray[i]);         
        }
    }
}
