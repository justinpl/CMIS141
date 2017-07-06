 /**
 * File Name   : MathDemo.java
 * Author      : Justin Luce
 * Date        : Jul 5, 2017
 * Description : Do simple math and print
 */
package mathDemo;

public class MathDemo 
{
    public static void main(String[] args) 
    {
        extractedAbs();
        extractedCeil();
    }
    public static int extractedAbs()
    {
        // get some integers to find their absolute values
        int x = 175;
        int y = -184;
        int x_AbsoluteValueOut = Math.abs(x);
       
        // get and print their absolute values
        System.out.println("Math.abs(" + x + ")=" + Math.abs(x));
        System.out.println("Math.abs(" + y + ")=" + Math.abs(y));
        System.out.println("Math.abs(-0)=" + Math.abs(-0));
        
        return x_AbsoluteValueOut;
    }
    public static double extractedCeil() 
    {
        // get two double numbers
        double x = 125.9;
        double y = 0.4873;
        double x_CeilValueOut = Math.ceil(x);
     
        // call ceal for these these numbers
        System.out.println("Math.ceil(" + x + ")=" + Math.ceil(x));
        System.out.println("Math.ceil(" + y + ")=" + Math.ceil(y));
        System.out.println("Math.ceil(-0.65)=" + Math.ceil(-0.65));
        
        return x_CeilValueOut;
    }    
}