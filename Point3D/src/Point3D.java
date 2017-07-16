/**
 * File Name   : Point3D.java
 * Author      : Justin Luce
 * Created on  : 16-07-2017
 * Description : Allows the creation, modification, and recall of 3D points in x,y,z format
 **/
class Point3D
{    
    private double x;
    private double y;
    private double z;
    
    // Constructor
    Point3D (double px, double py, double pz) 
    { 
        x = px; 
        y = py; 
        z = pz;
    }
    
    // Default constructor
    Point3D () 
    {
        x = 1.0; 
        y = -1.0; 
        z = -1.0;
    }
    
    // Setter methods 
    // setX
    void setX(double px) 
    {
        x = px;
    }
    // setY()
    void setY(double py)  
    {
        y = py;
    }
    void setZ(double pz)  
    {
        z = pz;
    }
    
    // Getter methods
    // getX
    double getX() 
    {
        return x;
    }    
    // getY
    double getY() 
    {
        return y;
    }
    double getZ()  
    {
        return z;
    }
    // Use Math method to get the distance between 2 points
    double getDistance(Point3D p1, Point3D p2) 
    {
        // delta x
        double deltaX = Math.abs(p1.getX() -p2.getX());
        // delta y
        double deltaY = Math.abs(p1.getY() -p2.getY());
        //delta z
        double deltaZ = Math.abs(p1.getZ() -p2.getZ());
        // Distance formula
        double distance = Math.sqrt(deltaX*deltaX + deltaY*deltaY + deltaZ*deltaZ);
        return distance;
    }
    // toString method
    public String toString() 
    {
        String str = "(" + x + ", " + y + ", " + z + ")";
        return str;
    }
}