package leetCode.solutions.java;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String romanNumber) {

        Map<Character, Integer> numbersMap = new HashMap<>();
        numbersMap.put('I', 1);
        numbersMap.put('V', 5);
        numbersMap.put('X', 10);
        numbersMap.put('L', 50);
        numbersMap.put('C', 100);
        numbersMap.put('D', 500);
        numbersMap.put('M', 1000);

        int result = 0;

        for (int i = 0; i < romanNumber.length(); i++) {
            char ch = romanNumber.charAt(i);
            System.out.println("\ni:" + i + " ch:" + ch);

            if (i > 0 && numbersMap.get(ch) > numbersMap.get(romanNumber.charAt(i-1))) {
                System.out.println("Case 1: " + numbersMap.get(ch) + " (numbersMap.get(ch)) > " + numbersMap.get(romanNumber.charAt(i-1)) + " (numbersMap.get(romanNumber.charAt(i-1))");

                // Case 1
                System.out.println("result(1) ---> " + (numbersMap.get(ch) - 2 * numbersMap.get(romanNumber.charAt(i-1))));
                result += numbersMap.get(ch) - 2 * numbersMap.get(romanNumber.charAt(i-1));
            } else {
                System.out.println("Case 2: " + numbersMap.get(ch) + " (numbersMap.get(ch))");

                // Case 2: Just add the corresponding number to result.
                result += numbersMap.get(ch);
            }
            System.out.println("result ---> " + result);
        }
        return result;
    }

    public static void main(String[] args) {
        String romanNumber = "MCMXCIV";
        int result = romanToInt(romanNumber);
        System.out.println("The Roman Number is: " + romanNumber);
        System.out.println("The Integer Value is: " + result);
    }
}
