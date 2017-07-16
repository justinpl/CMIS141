/**
 * File Name   : TestCombineWords.java
 * Author      : Justin Luce
 * Created on  : 16-07-2017
 * Description : tests the methods of combine words
 **/
class TestCombineWords
{
    public static void main(String[] args)  
    { 
        // Construct an object with two words
        CombineWords words = new CombineWords("foo", "bar");
        // Print the two words
        printValues(words);
        
        //combine the two words without declaring values
        String word = words.combine();
        //print the words combined
        System.out.println(word);
        
        //set new values
        String newX = "bar";
        String newY = "foo";
        words.setW1(newX);
        words.setW2(newY);

        //print new values
        printValues(words);
        
        //combine the two new words with declared values
        String newWord = words.combine(newX,newY);
        //print the words combined
        System.out.println(newWord);
    }
    // method to get and print values
    private static void printValues(CombineWords words)
    {
        // Call the getter methods
        String w1 = words.getW1();
        String w2 = words.getW2();
        
        // Print results
        System.out.println(w1 + "," + w2);
    }
}
