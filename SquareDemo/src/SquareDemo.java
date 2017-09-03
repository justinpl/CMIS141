/**
 * File Name   : SquareDemo.java
 * Author      : Justin Luce
 * Created on  : 30-07-2017
 * Description : 
 **/
public class SquareDemo
{
    // Define a static class variable
    // Hold number of objects
    private static int numSquares = 0;
    // Define class variable
    private double sideLength = 1.0;
    
    // Constructors
    // Default constructor
    public SquareDemo() 
    {        
        this(1.0);
    }
    public SquareDemo(double s) 
    {        
        this.sideLength = s;  
        numSquares++;
    }
    //Area Method
    public double getArea() 
    {
        double area = Math.pow(this.sideLength, 2);
        return area;
    }
    // Perimeter method
    public double getPerimeter() 
    {
        double perimeter = this.sideLength * 4;
        return perimeter;
    }
    // getter method
    public double getSideLength() 
    {
        return this.sideLength;
    } 
  
    public static int getNumSquares() 
    {
        return numSquares;
    } 
}
