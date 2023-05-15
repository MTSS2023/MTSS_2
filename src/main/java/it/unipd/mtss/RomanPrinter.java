////////////////////////////////////////////////////////////////////
// Marco Brugin 2010012
// Riccardo Rossi 2000554
//////////////////////////////////////////////////////////////////// 

package it.unipd.mtss;

public class RomanPrinter {

    static final  String[] letterI = {
        " _____  ",
        "|_   _| ",
        "  | |   ",
        "  | |   ",
        " _| |_  ",
        "|_____| "
    };
    static final String[] letterV = {
        "__      __ ",
        "\\ \\    / / ",
        " \\ \\  / /  ",
        "  \\ \\/ /   ",
        "   \\  /    ",
        "    \\/     "
    };
    static final String[] letterX = {
        "__   __ ",
        "\\ \\ / / ",
        " \\ V /  ",
        "  > <   ",
        " / . \\  ",
        "/_/ \\_\\ "
    };
    static final String[] letterL = {
        " _       ",
        "| |      ",
        "| |      ",
        "| |      ",
        "| |____  ",
        "|______| "
    };
    static final String[] letterC = {
        "  _____  ",
        " / ____| ",
        "| |      ",
        "| |      ",
        "| |____  ",
        " \\_____| "
    };
    static final String[] letterD = {
        " _____   ",
        "|  __ \\  ",
        "| |  | | ",
        "| |  | | ",
        "| |__| | ",
        "|_____/  "
    };
    static final String[] letterM = {
        " __  __  ",
        "|  \\/  | ",
        "| \\  / | ",
        "| |\\/| | ",
        "| |  | | ",
        "|_|  |_| "
    };

    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber){
        if(romanNumber.length()!=0) {
            String number = "";
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < romanNumber.length(); j++) {
                    number += printLine(romanNumber.substring(j, j + 1), i);
                }
                number += "\n";
            }
            return number;
        }
        else {
            throw new IllegalArgumentException("Can't print a void expression");
        }
    }

    private static String printLine(String letter, int index){
        String number = "";
        if (letter.equals("I")){number+=printI(index);}
        else if (letter.equals("V")){number+=printV(index);}
        else if (letter.equals("X")){number+=printX(index);}
        else if (letter.equals("L")){number+=printL(index);}
        else if (letter.equals("C")){number+=printC(index);}
        else if (letter.equals("D")){number+=printD(index);}
        else if (letter.equals("M")){number+=printM(index);}
        else {throw new IllegalArgumentException(letter+" is not a roman number");}
        return number;
    }

    private static String printI(int index){
        return(letterI[index]);
    }

    private static String printV(int index){
        return(letterV[index]);
    }

    private static String printX(int index){
        return(letterX[index]);
    }

    private static String printL(int index){
        return(letterL[index]);
    }

    private static String printC(int index){
        return(letterC[index]);
    }

    private static String printD(int index){
        return(letterD[index]);
    }

    private static String printM(int index){
        return(letterM[index]);
    }

}
