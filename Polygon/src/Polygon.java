/**
 * File Name   : Polygon.java
 * Author      : Justin Luce
 * Created on  : 16-07-2017
 * Description : Class to create a polygon 
 **/
public class Polygon {
    // declare variables
    private int numSides;
    private double sideLength;
    private double xCoord;
    private double yCoord;
    private double perimeter;
    // construct polygon with no arguments
    Polygon () {
        numSides = 4;
        sideLength = 5.0;
        xCoord = 0.0;
        yCoord = 0.0;
    }
    //construct polygon with arguments
    Polygon (int s, double l, double x, double y) {
        numSides = s;
        sideLength = l;
        xCoord = x;
        yCoord = y;
    }
    //Getters
    int getNumSides() {
        return numSides;
    }
    double getSideLength() {
        return sideLength;
    }
    double getXCoord() {
        return xCoord;
    }
    double getYCoord() {
        return yCoord;
    }
    double getPerimeter() {
        //multiple numsides by sidelength to get perimeter
        double perimeter = numSides*sideLength;
        return perimeter;
    }
    // print all values.
    public String toString() {
        String str = "(numSides=" + numSides + ", sideLength=" + sideLength + ", xCoord=" + xCoord + ", yCoord=" + yCoord+")";
        return str;
    }
}
