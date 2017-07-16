/**
 * File Name   : TestPolygon.java
 * Author      : Justin Luce
 * Created on  : 16-07-2017
 * Description : This program is design to test the Polygon class methods
 **/
public class TestPolygon
{
    public static void main(String[] args)
    {
        Polygon shape = new Polygon();
                
        System.out.println(shape.toString());
        System.out.println(shape.getNumSides());
        System.out.println(shape.getSideLength()); 
        System.out.println(shape.getXCoord());
        System.out.println(shape.getYCoord());
        System.out.println(shape.getPerimeter());
    }
}
