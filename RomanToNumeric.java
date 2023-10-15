import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        // Example usage
        String romanNumeral = "IX";
        int result = romanToInt(romanNumeral);
        System.out.println("Roman numeral " + romanNumeral + " is equivalent to integer " + result);
    }

    public static int romanToInt(String s) {
        // Create a map to store the values of Roman numerals
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;

        // Iterate through the Roman numeral string
        for (int i = 0; i < s.length(); i++) {
            // Get the integer value of the current Roman numeral
            int currentValue = romanValues.get(s.charAt(i));

            // If the next Roman numeral is greater than the current one, subtract the current value
            if (i + 1 < s.length() && romanValues.get(s.charAt(i + 1)) > currentValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }

        return result;
    }
}
