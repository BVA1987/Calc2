package Calkulator;
import java.util.List;
public class RomanArabicConverter {
    public static int romanToArabic(String input) {
        String romanNumeral = input.toUpperCase();
        int result = 0;

        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;


        while ((romanNumeral.length() > 0) && (i < romanNumerals.size())) {
            RomanNumeral symbol = romanNumerals.get(i);
            if (romanNumeral.startsWith(symbol.name())) {
                result += symbol.getValue();
                romanNumeral = romanNumeral.substring(symbol.name().length());
            } else {
                i++;
            }
        }


        if (romanNumeral.length() > 0) {
            throw new IllegalArgumentException(input + " Не может быть преобразован в римскую цифру");
        }



            return result;

        }
    }








