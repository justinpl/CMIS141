import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


/**
 * File Name   : USCrime.java
 * Author      : Justin Luce
 * Created on  : 12-08-2017
 * Description : This program reads and display calculations from crime statistic csv
 **/
public class USCrime {
    //declare crimeCSV
    static String[][] crimeCSV;
    //create intial timestamp
    static long timeStamp1 = System.currentTimeMillis()/1000;
    public static void main(String[] args) {
        //file location will be specified via command line
        String fileLocation = args[0];
        // import CSV into program
        importCSV(fileLocation);
        // display user menu
        displayMenu();
      
    }

    private static void importCSV(String fileLocation) 
    {
        FileInputStream in = null;
        BufferedReader inputStream = null;
        //initialize crimeCSV
        crimeCSV = new String[21][20];
        //initialize row counter
        int rowC = 0;
        
        String fileLine;
        try {
            // read content from CSV
            inputStream = new BufferedReader(new FileReader(fileLocation));

            // Read one Line using BufferedReader
            while ((fileLine = inputStream.readLine() ) != null) {
                //split line by comma and place in array
                String[] InArray = fileLine.split(",");
                //place items in 2D array by row and column
                for (int x = 0; x < InArray.length; x++)
                {
                    crimeCSV[rowC][x] = InArray[x];
                }
                rowC++;
                 
            }
        } catch (IOException io) {
            System.out.println("File IO exception" + io.getMessage());
        } finally {
            // the streams          
            try {
                // Close the streams
                if (in != null) {
                    in.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }              
            } catch (IOException io) {
                System.out.println("Issue closing the Files" + io.getMessage());
            }
        }
    }  
 // display the change in population between the years
    public static void getGrowthPercentages() {
        int x = 1;
        int y = 2;
        // calculate the difference between two years and diplay
        for (int i = 1; i < crimeCSV.length-1 ; i++) {
            float year1 = Float.parseFloat(crimeCSV[x][1]);
            float year2 = Float.parseFloat(crimeCSV[y][1]);
            float growth = ((year2-year1)/year1)*100;
            System.out.println(crimeCSV[x][0] + "-" + crimeCSV[y][0] + ": " + growth + "%");
            x++;
            y++;
        }
    }
    // determine the year with the highest murder rate
    public static String getMaxMurderYear() {
        String year = crimeCSV[1][0];
        int rate1 = Integer.parseInt(crimeCSV[1][4]);
        // determine the larger number and store it
        for (int i = 2; i < crimeCSV.length ; i++) {
            int rate2 = Integer.parseInt(crimeCSV[i][4]);
            if (rate2 > rate1) {
                rate1 = rate2;
                year = crimeCSV[i][0];
            }
        }
        return year;        
          
    }
 // determine the year with the lowest murder rate
    public static String getMinMurderYear() {
        String year = crimeCSV[1][0];
        int rate1 = Integer.parseInt(crimeCSV[1][4]);
        // determine the lower number and store it
        for (int i = 2; i < crimeCSV.length ; i++) {
            int rate2 = Integer.parseInt(crimeCSV[i][4]);
            if (rate2 < rate1) {
                rate1 = rate2;
                year = crimeCSV[i][0];
            }
        }        
        return year;  
    }
 // determine the year with the highest robbery rate
    public static String getMaxRobberyYear() {
        String year = crimeCSV[1][0];
        int rate1 = Integer.parseInt(crimeCSV[1][8]);
        // determine the larger number and store it
        for (int i = 2; i < crimeCSV.length ; i++) {
            int rate2 = Integer.parseInt(crimeCSV[i][8]);
            if (rate2 > rate1) {
                rate1 = rate2;
                year = crimeCSV[i][0];
            }
        }        
        return year;  
    }
 // determine the year with the lowest robbery rate
    public static String getMinRobberyYear() {
        String year = crimeCSV[1][0];
        int rate1 = Integer.parseInt(crimeCSV[1][8]);
        // determine the lower number and store it
        for (int i = 2; i < crimeCSV.length ; i++) {
            int rate2 = Integer.parseInt(crimeCSV[i][8]);
            if (rate2 < rate1) {
                rate1 = rate2;
                year = crimeCSV[i][0];
            }
        }        
        return year;  
    }
    //display the user menu
    public static void displayMenu() {
        while (true) {
            // print options
            String selection = "";
            System.out.println("********** Welcome to the US Crime Statistical Application **************************");
            System.out.println("Enter the number of the question you want answered. Enter 0 to quit the program :");
            System.out.println("1. What were the percentages in population growth for each consecutive year from 1994 – 2013?");
            System.out.println("2. What year was the Murder rate the highest?");
            System.out.println("3. What year was the Murder rate the lowest?");
            System.out.println("4. What year was the Robbery rate the highest?");
            System.out.println("5. What year was the Robbery rate the lowest?");
            System.out.println("0. Quit the program\n");
            Scanner scannerIn = new Scanner(System.in);
            // store users selection
            selection = scannerIn.nextLine();
            switch (selection) {
            // print message, time elapsed, and exit if choice is 0
            case "0":
                System.out.println("Thank you for trying the US Crimes Statistics Program.");
                long timeStamp2 = System.currentTimeMillis()/1000;
                System.out.println("Elapsed time in seconds was: " + (timeStamp2-timeStamp1));
                scannerIn.close();
                System.exit(0);
            // display growth if choice is 1
            case "1":
                getGrowthPercentages();
                break;
            // diplay highest murder year if choice is 2
            case "2":
                System.out.println("The Murder rate was highest in " + getMaxMurderYear()+ "\n");
                break;
            // display lowest murder year if choice is 3
            case "3":
                System.out.println("The Murder rate was lowest in " + getMinMurderYear()+ "\n");
                break;
            // diplay highest robbery year if choice is 4
            case "4":
                System.out.println("The Robbery rate was highest in " + getMaxRobberyYear()+ "\n");      
                break;
            // diplay lowest robbery year if choice is 5
            case "5":
                System.out.println("The Robbery rate was lowest in " + getMinRobberyYear()+ "\n");
                break;
            default:
                
            }
        }
    }
}
  
