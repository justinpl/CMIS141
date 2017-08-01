/**
 * File Name   : TestSquareDemo.java
 * Author      : Justin Luce
 * Created on  : 30-07-2017
 * Description : 
 **/
public class TestSquareDemo
{
    public static void main(String[] args)  
    { 
        // Construct a default Square
        SquareDemo square1 = new SquareDemo();

        // Call the get values
        System.out.println("Square 1 is: " + 
                square1.getSideLength());
        System.out.println("Square 1 Perimeter is: " + 
                SquareDemo.getPerimeter());
        System.out.println("Square 1 Area is: " + 
                SquareDemo.getArea()); 
        System.out.println("Number Squares is: " + 
               SquareDemo.getNumSquares());
         
        
        // Construct another Square
        SquareDemo square2 = new SquareDemo(2.0);
        System.out.println("Square 2 is: " + 
              square2.getSideLength());
        System.out.println("Square 2 Perimeter is: " + 
                SquareDemo.getPerimeter());
        System.out.println("Square 2 Area is: " + 
                SquareDemo.getArea());        
        System.out.println("Number Squares is: " + 
              SquareDemo.getNumSquares());
        
        // Construct another Square
        SquareDemo square3 = new SquareDemo(3.0);
        System.out.println("Square 3 is: " + 
               square3.getSideLength());
        System.out.println("Square 3 Perimeter is: " + 
                SquareDemo.getPerimeter());
        System.out.println("Square 3 Area is: " + 
                SquareDemo.getArea()); 
        System.out.println("Number Squares is: " + 
               SquareDemo.getNumSquares());
        
     // Construct another Square
        SquareDemo square4 = new SquareDemo(4.0);
        System.out.println("Square 4 is: " + 
               square4.getSideLength());
        System.out.println("Square 4 Perimeter is: " + 
                SquareDemo.getPerimeter());
        System.out.println("Square 4 Area is: " + 
                SquareDemo.getArea()); 
        System.out.println("Number Squares is: " + 
               SquareDemo.getNumSquares());
        
     // Construct another Square
        SquareDemo square5 = new SquareDemo(5.0);
        System.out.println("Square 5 is: " + 
               square5.getSideLength());
        System.out.println("Square 5 Perimeter is: " + 
                SquareDemo.getPerimeter());
        System.out.println("Square 5 Area is: " + 
                SquareDemo.getArea()); 
        System.out.println("Number Squares is: " + 
               SquareDemo.getNumSquares());
           
    }
}
