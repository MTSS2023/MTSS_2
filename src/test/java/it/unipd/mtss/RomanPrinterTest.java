////////////////////////////////////////////////////////////////////
// Marco Brugin 2010012
// Riccardo Rossi 2000554
//////////////////////////////////////////////////////////////////// 

package it.unipd.mtss;

import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class RomanPrinterTest {
    
    @Test
    public void TestIPrinter(){
        try (MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(1)).thenReturn("I");
            String letterI =
                " _____  \n"+
                "|_   _| \n"+
                "  | |   \n"+
                "  | |   \n"+
                " _| |_  \n"+
                "|_____| \n";

            assertEquals(letterI, RomanPrinter.print(1));
        }
    }

    @Test
    public void TestVPrinter(){
        try (MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(5)).thenReturn("V");
            String letterV =
                "__      __ \n"+
                "\\ \\    / / \n"+
                " \\ \\  / /  \n"+
                "  \\ \\/ /   \n"+
                "   \\  /    \n"+
                "    \\/     \n";

            assertEquals(letterV, RomanPrinter.print(5));
        }
    }

    @Test
    public void TestXPrinter(){
        try(MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(10)).thenReturn("X");
            String letterX =
                "__   __ \n"+
                "\\ \\ / / \n"+
                " \\ V /  \n"+
                "  > <   \n"+
                " / . \\  \n"+
                "/_/ \\_\\ \n";

            assertEquals(letterX, RomanPrinter.print(10));
        }
    }

    @Test
    public void TestLPrinter(){
        try(MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(50)).thenReturn("L");
            String letterL =
                " _       \n"+
                "| |      \n"+
                "| |      \n"+
                "| |      \n"+
                "| |____  \n"+
                "|______| \n";
            assertEquals(letterL, RomanPrinter.print(50));
        }
    }

    @Test
    public void TestCPrinter(){
        try(MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(100)).thenReturn("C");
            String letterC =
                "  _____  \n"+
                " / ____| \n"+
                "| |      \n"+
                "| |      \n"+
                "| |____  \n"+
                " \\_____| \n";

            assertEquals(letterC, RomanPrinter.print(100));
        }
    }

    @Test
    public void TestDPrinter(){
        try(MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(500)).thenReturn("D");
            String letterD =
                " _____   \n"+
                "|  __ \\  \n"+
                "| |  | | \n"+
                "| |  | | \n"+
                "| |__| | \n"+
                "|_____/  \n";

            assertEquals(letterD, RomanPrinter.print(500));
        }
    }

    @Test
    public void TestMPrinter(){
        try(MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(1000)).thenReturn("M");
            String letterM =
                " __  __  \n"+
                "|  \\/  | \n"+
                "| \\  / | \n"+
                "| |\\/| | \n"+
                "| |  | | \n"+
                "|_|  |_| \n";

            assertEquals(letterM, RomanPrinter.print(1000));
        }
    }

    @Test (expected = IllegalArgumentException.class)
    public void VoidRomanNumber(){
        try(MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(1)).thenReturn("");
            RomanPrinter romanPrinter = new RomanPrinter();
            romanPrinter.print(1);
        }
    }
}
