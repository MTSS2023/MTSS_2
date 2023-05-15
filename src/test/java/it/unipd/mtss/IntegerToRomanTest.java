////////////////////////////////////////////////////////////////////
// Marco Brugin 2010012
// Riccardo Rossi 2000554
//////////////////////////////////////////////////////////////////// 

package it.unipd.mtss;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class IntegerToRomanTest {

    private IntegerToRoman convert;
    
    @Before
    public void before(){
        convert = new IntegerToRoman();
    }
    @Test
    public void testConvertOnetoRoman(){
        assertEquals("I", convert.convert(1));
    }
    @Test
    public void testConvertThreetoRoman(){
        assertEquals("III", convert.convert(3));
    }
    @Test
    public void testConvertFourtoRoman(){
        assertEquals("IV", convert.convert(4));
    }
    @Test
    public void testConvertFivetoRoman(){
        assertEquals("V", convert.convert(5));
    }
    @Test
    public void testConvertNinetoRoman(){
        assertEquals("IX", convert.convert(9));
    }
    @Test
    public void testConvertTentoRoman(){
        assertEquals("X", convert.convert(10));
    }
    @Test
    public void testConvertFourtytoRoman(){
        assertEquals("XL", convert.convert(40));
    }
    @Test
    public void testConvertFiftytoRoman(){
        assertEquals("L", convert.convert(50));
    }
    @Test
    public void testConvertNinetytoRoman(){
        assertEquals("XC", convert.convert(90));
    }
    @Test
    public void testConvertOneHundredtoRoman(){
        assertEquals("C", convert.convert(100));
    }
    @Test
    public void testConvertFourHundredtoRoman(){
        assertEquals("CD", convert.convert(400));
    }
    @Test
    public void testConvertFiveHundredtoRoman(){
        assertEquals("D", convert.convert(500));
    }
    @Test
    public void testConvertNineHundredtoRoman(){
        assertEquals("CM", convert.convert(900));
    }
    @Test
    public void testConvertOneThousandtoRoman(){
        assertEquals("M", convert.convert(1000));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testConvertNumberMinorOnetoRoman(){
        convert.convert(0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testConvertNumberMajorOneThousandtoRoman(){
        convert.convert(1001);
    }
    @Test(expected = NumberFormatException.class)
    public void testConvertStringtoRoman(){
        convert.convert(Integer.parseInt("a"));
    }

}