/**
 * File Name   : Course.java
 * Author      : Justin Luce
 * Created on  : 31-07-2017
* Purpose: This program demonstrates the 
* use overloaded constructors
* for a course class in Java
*/

public class Course 
{  
    // Define a static class variable
    // Hold number of objects
    private static int numCourses = 0;
    // Define class variables
    private int numStudents = 34;
    private String courseName = new String("New Course");
      
    // Constructors
    // Default constructor
    public Course() 
    {     
        // this must be called first   
        this(34,"New Course");          
    }
    // Full parameterized Constructor
    public Course (int numStudents, String courseName) 
    {
        this.numStudents = numStudents;
        this.courseName = courseName;
        numCourses++;
    }
    // Partial parameterized Constructor
    public Course (int numStudents) 
    {
        // Number of Students is defined
        this(numStudents,"New Course");    
        this.numStudents = numStudents;   
    }

    //Partial parameterized Constructor
    public Course (String courseName) 
    {
        // Number of Students is defined        
        this(34,courseName); 
        this.courseName = courseName;      
    }
    // getter method
    public String getCourseName() 
    {
        return this.courseName;
    } 
    
    public int getNumStudents() 
    {
        return this.numStudents;
    } 
  
    public static int getNumCourses() 
    {
        return numCourses;
    } 
   
}