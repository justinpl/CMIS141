/**
 * File Name   : MathDemoTest.java
 * Author      : Justin Luce
 * Date        : Jul 5, 2017
 * Description : Tests MathDemo methods 
 */
package mathDemo;

import static org.junit.Assert.*;
import org.junit.Test;

public class MathDemoTest extends MathDemo
{
    @Test
    public void testAbs()
    {
        int absValue = MathDemo.extractedAbs();
        assertTrue(absValue == 175);
    }
    @Test
    public void testCeil()
    {
        double ceilValue = MathDemo.extractedCeil();
        assertTrue(ceilValue == 126.0d);
    }
}
