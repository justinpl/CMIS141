/**
 * File Name   : RolePlayingGame.java
 * Author      : Justin Luce
 * Date        : Jul 2, 2017
 * Description : users choose which direction to move
 */

// Import statements
import java.util.Scanner;

public class RolePlayingGame
{
    public static void main(String[] args)
    {
        // Variables to hold values
        int xAxis = 0;
        int yAxis = 0;
        
        System.out.println("Try to escape the labyrinth!");
        while (true)
        {
            // Display a starting point
            System.out.println("Your current location is X:"+xAxis+",Y:"+yAxis);
            
            // Use the Scanner class to input data
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the direction you wish to go: (N,E,S,W)");
            String direction =scanner.nextLine();
            String directionCapital = direction.toUpperCase().trim();
                    
            if ((directionCapital.equals("N")) ||
                (directionCapital.equals("E")) ||
                (directionCapital.equals("S")) ||
                (directionCapital.equals("W")));
            else
            {
                System.out.println("Invalid Entry");
            }
            // choose what direction to go
            switch (directionCapital) 
            {
                case "N": 
                    // Print out north
                    System.out.println("You moved North");
                    yAxis++;
                    break;
                case "E": 
                    // Print out east
                    System.out.println("You moved East");
                    xAxis++;
                    break;
                case "S": 
                    // Print out south
                    System.out.println("You moved South");
                    yAxis--;
                    break;
                case "W":
                    // Print out west
                    System.out.println("You moved West");
                    xAxis--;
                    break;
            }
            if ((xAxis == 2) & (yAxis == -2)) 
            {
                System.out.println("You've escaped the labyrinth!");
                System.exit(0);
            }
        }
    }
}
