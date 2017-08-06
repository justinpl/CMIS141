/**
 * File Name   : TestHeadPhone.java
 * Author      : Justin Luce
 * Created on  : 31-07-2017
 * Description : this initializes an object, changes values and prints.
 **/
public class TestHeadPhone {
    
    public static void main(String[] args) {
        // initialize object
        HeadPhone headPhone = new HeadPhone();
        // print default object
        System.out.println(headPhone.toString());
        
        // initialize object
        HeadPhone headPhone2 = new HeadPhone(3,true,"Sony","500",1,1,1);
        // use setters to change values
        System.out.println(headPhone2.toString());
        
        // initialize object
        HeadPhone headPhone3 = new HeadPhone(1,true,"Samsung","800",40,40,40);
        // print changes
        System.out.println(headPhone3.toString());
        System.out.println(headPhone.toString());
    }
}
