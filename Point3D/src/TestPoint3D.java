/**
 * File Name   : TestPoint3D.java
 * Author      : Justin Luce
 * Created on  : 16-07-2017
 * Description : This program constructs instances of the Point3D class and uses its methods
 **/
public class TestPoint3D
{
    public static void main(String[] args)  
    { 
        // Construct a point with 1.0, 1.0, 1.0
        Point3D p1 = new Point3D(1.0,1.0,1.0);
        
        // Construct a default point
        Point3D p2 = new Point3D();
        
        // Call the getter methods
        double p1X = p1.getX();
        double p1Y = p1.getY();
        double p1Z = p1.getZ();
        // Print results
        System.out.println("p1 values from getX() getY() getZ() " + p1X + "," + p1Y + "," + p1Z);
        
        double p2X = p2.getX();
        double p2Y = p2.getY();
        double p2Z = p2.getZ();
        // Print results
        System.out.println("p2 values from getX() getY() getZ() " + p2X + "," + p2Y + "," + p2Z);
        
        // Call the Distance Method
        double distance = p1.getDistance(p1,p2);
        
        // Print results
        System.out.println("Distance between p1 and p2 is: " + distance);
        
        // Change the XYZ value of P1 using the setter method
        double newX = 2.0;
        double newY = 2.0;
        double newZ = 2.0;
        p1.setX(newX);
        p1.setY(newY);
        p1.setY(newZ);

        // Recalculate the Distance
        distance = p1.getDistance(p1,p2);
        
        // Print results
        System.out.println("New Distance between p1 and p2 is: " + distance);
        
        // Display the values using toString
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}