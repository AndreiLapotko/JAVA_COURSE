package Seminar05;

import java.util.HashMap;
import java.util.Map;

public class Rim {
    
    public static void main(String[] args) {
        String romanNum = "MMXXV";
        System.out.println(romanToArabic(romanNum));
        
    }
    public static Map<Character, Integer> getRomanArabicMap() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;

    }
    public static int romanToArabic(String romanNumber) {
        Map<Character, Integer> map = getRomanArabicMap();
        int result = 0;
        int prevValue = 0;
        for (int i = romanNumber.length()-1; i >= 0; i--) {
            int currentValue = map.get(romanNumber.charAt(i));
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }
        return result;

    }
}