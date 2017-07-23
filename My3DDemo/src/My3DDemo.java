/**
 * File Name   : My3DDemo.java
 * Author      : Justin Luce
 * Created on  : 22-07-2017
 * Description : 
 **/
public class My3DDemo
{
    // Define constant array size
    static final int LEVEL1 = 5;
    static final int LEVEL2 = 20;
    static final int LEVEL3 = 10;
    
    public static void main(String[] args)
    {
        int[][][] array3D = new int[LEVEL1][LEVEL2][LEVEL3];
        
        for (int k=0; k<LEVEL1; k++) 
        {
            for (int i=0; i<LEVEL2; i++) 
            {
                for (int j=0; j<LEVEL3; j++) 
                {
                    array3D[k][i][j] = (int) (Math.random() * 30) + 1;    
                }
            }     
        }
        for (int k=0; k<LEVEL1; k++) 
        {
            for (int j=0; j<LEVEL3; j++) 
            {   
                for (int i=0; i<LEVEL2; i++) 
                {                       
                    System.out.print(array3D[k][i][j] + "\t");    
                }
                System.out.println("LEVEL2"); 
            }
            System.out.println("LEVEL3");
        }
        System.out.println("LEVEL1");
    }
}
