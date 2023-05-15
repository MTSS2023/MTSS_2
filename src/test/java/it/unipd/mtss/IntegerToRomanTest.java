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
    public void Before(){
        convert = new IntegerToRoman();
    }
    @Test
    public void TestConvertOnetoRoman(){
        assertEquals("I", convert.convert(1));
    }
    @Test
    public void TestConvertThreetoRoman(){
        assertEquals("III", convert.convert(3));
    }
    @Test
    public void TestConvertFourtoRoman(){
        assertEquals("IV", convert.convert(4));
    }
    @Test
    public void TestConvertFivetoRoman(){
        assertEquals("V", convert.convert(5));
    }
    @Test
    public void TestConvertNinetoRoman(){
        assertEquals("IX", convert.convert(9));
    }
    @Test
    public void TestConvertTentoRoman(){
        assertEquals("X", convert.convert(10));
    }
    @Test
    public void TestConvertFourtytoRoman(){
        assertEquals("XL", convert.convert(40));
    }
    @Test
    public void TestConvertFiftytoRoman(){
        assertEquals("L", convert.convert(50));
    }
    @Test
    public void TestConvertNinetytoRoman(){
        assertEquals("XC", convert.convert(90));
    }
    @Test
    public void TestConvertOneHundredtoRoman(){
        assertEquals("C", convert.convert(100));
    }
    @Test
    public void TestConvertFourHundredtoRoman(){
        assertEquals("CD", convert.convert(400));
    }
    @Test
    public void TestConvertFiveHundredtoRoman(){
        assertEquals("D", convert.convert(500));
    }
    @Test
    public void TestConvertNineHundredtoRoman(){
        assertEquals("CM", convert.convert(900));
    }
    @Test
    public void TestConvertOneThousandtoRoman(){
        assertEquals("M", convert.convert(1000));
    }
    @Test(expected = IllegalArgumentException.class)
    public void TestConvertNumberMinorOnetoRoman(){
        convert.convert(0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void TestConvertNumberMajorOneThousandtoRoman(){
        convert.convert(1001);
    }
    @Test(expected = NumberFormatException.class)
    public void TestConvertStringtoRoman(){
        convert.convert(Integer.parseInt("a"));
    }

}