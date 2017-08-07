/**
 * File Name   : RandomX.java
 * Author      : Justin Luce
 * Created on  : 06-08-2017
 * Description : print random numbers between 0 and y x number of times
 **/
public class RandomX
{
    public static void main(String[] args) 
    {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        for (int i = 0; i < x; i++) 
        {
            System.out.println(Math.random() * y);
        }
    }
}