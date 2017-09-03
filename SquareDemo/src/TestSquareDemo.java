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
                square1.getPerimeter());
        System.out.println("Square 1 Area is: " + 
                square1.getArea()); 
        System.out.println("Number Squares is: " + 
                square1.getNumSquares());
         
        
        // Construct another Square
        SquareDemo square2 = new SquareDemo(2.0);
        System.out.println("Square 2 is: " + 
              square2.getSideLength());
        System.out.println("Square 2 Perimeter is: " + 
                square2.getPerimeter());
        System.out.println("Square 2 Area is: " + 
                square2.getArea());        
        System.out.println("Number Squares is: " + 
                square2.getNumSquares());
        
        // Construct another Square
        SquareDemo square3 = new SquareDemo(3.0);
        System.out.println("Square 3 is: " + 
               square3.getSideLength());
        System.out.println("Square 3 Perimeter is: " + 
                square3.getPerimeter());
        System.out.println("Square 3 Area is: " + 
                square3.getArea()); 
        System.out.println("Number Squares is: " + 
                square3.getNumSquares());
        
     // Construct another Square
        SquareDemo square4 = new SquareDemo(4.0);
        System.out.println("Square 4 is: " + 
               square4.getSideLength());
        System.out.println("Square 4 Perimeter is: " + 
                square4.getPerimeter());
        System.out.println("Square 4 Area is: " + 
                square4.getArea()); 
        System.out.println("Number Squares is: " + 
                square4.getNumSquares());
        
     // Construct another Square
        SquareDemo square5 = new SquareDemo(5.0);
        System.out.println("Square 5 is: " + 
               square5.getSideLength());
        System.out.println("Square 5 Perimeter is: " + 
                square5.getPerimeter());
        System.out.println("Square 5 Area is: " + 
                square5.getArea()); 
        System.out.println("Number Squares is: " + 
                square5.getNumSquares());
        
        System.out.println("Square 1 is: " + 
                square1.getSideLength());
        System.out.println("Square 1 Perimeter is: " + 
                square1.getPerimeter());
        System.out.println("Square 1 Area is: " + 
                square1.getArea()); 
        System.out.println("Number Squares is: " + 
                square1.getNumSquares());
           
    }
}
