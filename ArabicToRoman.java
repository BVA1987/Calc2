package Calkulator;
import java.util.List;
public class ArabicToRoman {
    public static String arabicToRoman(int number) {
        if ((number <= 0)) {
            throw new IllegalArgumentException("Введеное не может быть меньше или равно нулю");
           }

        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

        int i=0;
        StringBuilder sd = new StringBuilder();

        while ((number > 0) && i < romanNumerals.size()) {
            RomanNumeral currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getValue() <= number) {
                sd.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else {
                i++;
            }

            }




    return  sd.toString();
   }
}
