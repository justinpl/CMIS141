/**
 * File Name   : CombineWords.java
 * Author      : Justin Luce
 * Created on  : 16-07-2017
 * Description : Changes a sentence into Pig Latin.
 **/
class CombineWords
{
    private String x = "foo";
    private String y = "bar";
    
    CombineWords(String w1, String w2)
    {
        x = w1;
        y = w2; 
    }
    
    // setW1
    void setW1(String w1) 
    {
        x = w1;
    }
    // setW2
    void setW2(String w2) 
    {
        y = w2;
    }
    
    // getW1
    String getW1() 
    {
        return x;
    }   
    // GetW2
    String getW2() 
    {
        return y;
    }
    String combine()
    {
        String w1 = x.toString();
        String w2 = y.toString();
        String combined = w1 + w2; 
        return combined;
    }
    String combine(String x, String y)
    {
        String combined = x + y; 
        return combined;
    }
}