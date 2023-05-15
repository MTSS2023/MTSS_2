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

    @Test (expected = IllegalArgumentException.class)
    public void InvalidRomanNumber(){
        try(MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(1)).thenReturn("A");
            RomanPrinter romanPrinter = new RomanPrinter();
            romanPrinter.print(1);
        }
    }

    @Test
    public void TestIIPrinter(){
        try (MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(() -> IntegerToRoman.convert(2)).thenReturn("II");
            String expected =
                    " _____   _____  \n"+
                    "|_   _| |_   _| \n"+
                    "  | |     | |   \n"+
                    "  | |     | |   \n"+
                    " _| |_   _| |_  \n"+
                    "|_____| |_____| \n";

            assertEquals(expected, RomanPrinter.print(2));
        }
    }

    @Test
    public void TestIVPrinter(){
        try (MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(4)).thenReturn("IV");
            String expected =
                    " _____  __      __ \n"+
                    "|_   _| \\ \\    / / \n"+
                    "  | |    \\ \\  / /  \n"+
                    "  | |     \\ \\/ /   \n"+
                    " _| |_     \\  /    \n"+
                    "|_____|     \\/     \n";

            assertEquals(expected, RomanPrinter.print(4));
        }
    }

    @Test
    public void TestVIPrinter(){
        try (MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(() -> IntegerToRoman.convert(6)).thenReturn("VI");
            String expected =
                    "__      __  _____  \n"+
                    "\\ \\    / / |_   _| \n"+
                    " \\ \\  / /    | |   \n"+
                    "  \\ \\/ /     | |   \n"+
                    "   \\  /     _| |_  \n"+
                    "    \\/     |_____| \n";

            assertEquals(expected, RomanPrinter.print(6));
        }
    }

    @Test
    public void TestIXPrinter(){
        try (MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(() -> IntegerToRoman.convert(9)).thenReturn("IX");
            String expected =
                    " _____  __   __ \n"+
                    "|_   _| \\ \\ / / \n"+
                    "  | |    \\ V /  \n"+
                    "  | |     > <   \n"+
                    " _| |_   / . \\  \n"+
                    "|_____| /_/ \\_\\ \n";

            assertEquals(expected, RomanPrinter.print(9));
        }
    }

    @Test
    public void TestXIPrinter(){
        try (MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(() -> IntegerToRoman.convert(11)).thenReturn("XI");
            String expected =
                    "__   __  _____  \n"+
                    "\\ \\ / / |_   _| \n"+
                    " \\ V /    | |   \n"+
                    "  > <     | |   \n"+
                    " / . \\   _| |_  \n"+
                    "/_/ \\_\\ |_____| \n";

            assertEquals(expected, RomanPrinter.print(11));
        }
    }

    @Test
    public void TestXVPrinter(){
        try (MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(15)).thenReturn("XV");
            String expected =
                    "__   __ __      __ \n"+
                    "\\ \\ / / \\ \\    / / \n"+
                    " \\ V /   \\ \\  / /  \n"+
                    "  > <     \\ \\/ /   \n"+
                    " / . \\     \\  /    \n"+
                    "/_/ \\_\\     \\/     \n";

            assertEquals(expected, RomanPrinter.print(15));
        }
    }

    @Test
    public void TestXXPrinter(){
        try (MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(20)).thenReturn("XX");
            String expected =
                    "__   __ __   __ \n"+
                    "\\ \\ / / \\ \\ / / \n"+
                    " \\ V /   \\ V /  \n"+
                    "  > <     > <   \n"+
                    " / . \\   / . \\  \n"+
                    "/_/ \\_\\ /_/ \\_\\ \n";

            assertEquals(expected, RomanPrinter.print(20));
        }
    }

    @Test
    public void TestXLPrinter(){
        try (MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(40)).thenReturn("XL");
            String expected =
                    "__   __  _       \n"+
                    "\\ \\ / / | |      \n"+
                    " \\ V /  | |      \n"+
                    "  > <   | |      \n"+
                    " / . \\  | |____  \n"+
                    "/_/ \\_\\ |______| \n";

            assertEquals(expected, RomanPrinter.print(40));
        }
    }

    @Test
    public void TestLXPrinter(){
        try (MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(60)).thenReturn("LX");
            String expected =
                    " _       __   __ \n"+
                    "| |      \\ \\ / / \n"+
                    "| |       \\ V /  \n"+
                    "| |        > <   \n"+
                    "| |____   / . \\  \n"+
                    "|______| /_/ \\_\\ \n";


            assertEquals(expected, RomanPrinter.print(60));
        }
    }

    @Test
    public void TestXCPrinter(){
        try (MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(90)).thenReturn("XC");
            String expected =
                    "__   __   _____  \n"+
                    "\\ \\ / /  / ____| \n"+
                    " \\ V /  | |      \n"+
                    "  > <   | |      \n"+
                    " / . \\  | |____  \n"+
                    "/_/ \\_\\  \\_____| \n";

            assertEquals(expected, RomanPrinter.print(90));
        }
    }

    @Test
    public void TestLIPrinter(){
        try (MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(51)).thenReturn("LI");
            String expected =
                    " _        _____  \n"+
                    "| |      |_   _| \n"+
                    "| |        | |   \n"+
                    "| |        | |   \n"+
                    "| |____   _| |_  \n"+
                    "|______| |_____| \n";

            assertEquals(expected, RomanPrinter.print(51));
        }
    }

    @Test
    public void TestLVPrinter(){
        try (MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(55)).thenReturn("LV");
            String expected =
                    " _       __      __ \n"+
                    "| |      \\ \\    / / \n"+
                    "| |       \\ \\  / /  \n"+
                    "| |        \\ \\/ /   \n"+
                    "| |____     \\  /    \n"+
                    "|______|     \\/     \n";

            assertEquals(expected, RomanPrinter.print(55));

        }
    }

    @Test
    public void TestFourCIPrinter(){
        try (MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(101)).thenReturn("CI");
            String expected =
                    "  _____   _____  \n"+
                    " / ____| |_   _| \n"+
                    "| |        | |   \n"+
                    "| |        | |   \n"+
                    "| |____   _| |_  \n"+
                    " \\_____| |_____| \n";

            assertEquals(expected, RomanPrinter.print(101));
        }
    }

    @Test
    public void TestFourCVPrinter(){
        try (MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(105)).thenReturn("CV");
            String expected =
                    "  _____  __      __ \n"+
                    " / ____| \\ \\    / / \n"+
                    "| |       \\ \\  / /  \n"+
                    "| |        \\ \\/ /   \n"+
                    "| |____     \\  /    \n"+
                    " \\_____|     \\/     \n";

            assertEquals(expected, RomanPrinter.print(105));
        }
    }

    @Test
    public void TestFourCXPrinter(){
        try (MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(110)).thenReturn("CX");
            String expected =
                    "  _____  __   __ \n"+
                    " / ____| \\ \\ / / \n"+
                    "| |       \\ V /  \n"+
                    "| |        > <   \n"+
                    "| |____   / . \\  \n"+
                    " \\_____| /_/ \\_\\ \n";

            assertEquals(expected, RomanPrinter.print(110));
        }
    }

    @Test
    public void TestFourCLPrinter(){
        try (MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(150)).thenReturn("CL");
            String expected =
                    "  _____   _       \n"+
                    " / ____| | |      \n"+
                    "| |      | |      \n"+
                    "| |      | |      \n"+
                    "| |____  | |____  \n"+
                    " \\_____| |______| \n";

            assertEquals(expected, RomanPrinter.print(150));
        }
    }

    @Test
    public void TestFourCCPrinter(){
        try (MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(200)).thenReturn("CC");
            String expected =
                    "  _____    _____  \n"+
                    " / ____|  / ____| \n"+
                    "| |      | |      \n"+
                    "| |      | |      \n"+
                    "| |____  | |____  \n"+
                    " \\_____|  \\_____| \n";

            assertEquals(expected, RomanPrinter.print(200));
        }
    }

    @Test
    public void TestCDPrinter(){
        try (MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(400)).thenReturn("CD");
            String expected =
                    "  _____   _____   \n"+
                    " / ____| |  __ \\  \n"+
                    "| |      | |  | | \n"+
                    "| |      | |  | | \n"+
                    "| |____  | |__| | \n"+
                    " \\_____| |_____/  \n";

            assertEquals(expected, RomanPrinter.print(400));
        }
    }

    @Test
    public void TestCMPrinter(){
        try (MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(900)).thenReturn("CM");
            String expected =
                    "  _____   __  __  \n"+
                    " / ____| |  \\/  | \n"+
                    "| |      | \\  / | \n"+
                    "| |      | |\\/| | \n"+
                    "| |____  | |  | | \n"+
                    " \\_____| |_|  |_| \n";

            assertEquals(expected, RomanPrinter.print(900));
        }
    }

    @Test
    public void TestDIPrinter(){
        try (MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(501)).thenReturn("DI");
            String expected =
                    " _____    _____  \n"+
                    "|  __ \\  |_   _| \n"+
                    "| |  | |   | |   \n"+
                    "| |  | |   | |   \n"+
                    "| |__| |  _| |_  \n"+
                    "|_____/  |_____| \n";

            assertEquals(expected, RomanPrinter.print(501));
        }
    }

    @Test
    public void TestDVPrinter(){
        try (MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(505)).thenReturn("DV");
            String expected =
                    " _____   __      __ \n"+
                    "|  __ \\  \\ \\    / / \n"+
                    "| |  | |  \\ \\  / /  \n"+
                    "| |  | |   \\ \\/ /   \n"+
                    "| |__| |    \\  /    \n"+
                    "|_____/      \\/     \n";

            assertEquals(expected, RomanPrinter.print(505));
        }
    }

    @Test
    public void TestDXPrinter(){
        try (MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(510)).thenReturn("DX");
            String expected =
                    " _____   __   __ \n"+
                    "|  __ \\  \\ \\ / / \n"+
                    "| |  | |  \\ V /  \n"+
                    "| |  | |   > <   \n"+
                    "| |__| |  / . \\  \n"+
                    "|_____/  /_/ \\_\\ \n";

            assertEquals(expected, RomanPrinter.print(510));
        }
    }

    @Test
    public void TestDLPrinter(){
        try (MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(550)).thenReturn("DL");
            String expected =
                    " _____    _       \n"+
                    "|  __ \\  | |      \n"+
                    "| |  | | | |      \n"+
                    "| |  | | | |      \n"+
                    "| |__| | | |____  \n"+
                    "|_____/  |______| \n";

            assertEquals(expected, RomanPrinter.print(550));
        }
    }

    @Test
    public void TestDCPrinter(){
        try (MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(600)).thenReturn("DC");
            String expected =
                    " _____     _____  \n"+
                    "|  __ \\   / ____| \n"+
                    "| |  | | | |      \n"+
                    "| |  | | | |      \n"+
                    "| |__| | | |____  \n"+
                    "|_____/   \\_____| \n";

            assertEquals(expected, RomanPrinter.print(600));
        }
    }

    @Test
    public void TestMIPrinter(){
        try(MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(1001)).thenReturn("MI");
            String expected =
                    " __  __   _____  \n"+
                    "|  \\/  | |_   _| \n"+
                    "| \\  / |   | |   \n"+
                    "| |\\/| |   | |   \n"+
                    "| |  | |  _| |_  \n"+
                    "|_|  |_| |_____| \n";

            assertEquals(expected, RomanPrinter.print(1001));
        }
    }

    @Test
    public void TestMVPrinter(){
        try(MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(1005)).thenReturn("MV");
            String expected =
                    " __  __  __      __ \n"+
                    "|  \\/  | \\ \\    / / \n"+
                    "| \\  / |  \\ \\  / /  \n"+
                    "| |\\/| |   \\ \\/ /   \n"+
                    "| |  | |    \\  /    \n"+
                    "|_|  |_|     \\/     \n";

            assertEquals(expected, RomanPrinter.print(1005));
        }
    }

    @Test
    public void TestMXPrinter(){
        try(MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(1010)).thenReturn("MX");
            String expected =
                    " __  __  __   __ \n"+
                    "|  \\/  | \\ \\ / / \n"+
                    "| \\  / |  \\ V /  \n"+
                    "| |\\/| |   > <   \n"+
                    "| |  | |  / . \\  \n"+
                    "|_|  |_| /_/ \\_\\ \n";

            assertEquals(expected, RomanPrinter.print(1010));
        }
    }

    @Test
    public void TestMLPrinter(){
        try(MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(1050)).thenReturn("ML");
            String expected =
                    " __  __   _       \n"+
                    "|  \\/  | | |      \n"+
                    "| \\  / | | |      \n"+
                    "| |\\/| | | |      \n"+
                    "| |  | | | |____  \n"+
                    "|_|  |_| |______| \n";

            assertEquals(expected, RomanPrinter.print(1050));
        }
    }

    @Test
    public void TestMCPrinter(){
        try(MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(1100)).thenReturn("MC");
            String expected =
                    " __  __    _____  \n"+
                    "|  \\/  |  / ____| \n"+
                    "| \\  / | | |      \n"+
                    "| |\\/| | | |      \n"+
                    "| |  | | | |____  \n"+
                    "|_|  |_|  \\_____| \n";

            assertEquals(expected, RomanPrinter.print(1100));
        }
    }

    @Test
    public void TestMDPrinter(){
        try(MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(1500)).thenReturn("MD");
            String expected =
                    " __  __   _____   \n"+
                    "|  \\/  | |  __ \\  \n"+
                    "| \\  / | | |  | | \n"+
                    "| |\\/| | | |  | | \n"+
                    "| |  | | | |__| | \n"+
                    "|_|  |_| |_____/  \n";

            assertEquals(expected, RomanPrinter.print(1500));
        }
    }

    @Test
    public void TestMMPrinter(){
        try(MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(2000)).thenReturn("MM");
            String expected =
                    " __  __   __  __  \n"+
                    "|  \\/  | |  \\/  | \n"+
                    "| \\  / | | \\  / | \n"+
                    "| |\\/| | | |\\/| | \n"+
                    "| |  | | | |  | | \n"+
                    "|_|  |_| |_|  |_| \n";

            assertEquals(expected, RomanPrinter.print(2000));
        }
    }
    
}
