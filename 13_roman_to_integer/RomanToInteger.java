import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
        // romanToInt("CDIIVIIX");
        
    }

    public static int romanToInt(String s) {
        int total = 0;
        HashMap<String, Integer> romantoArabMap = new HashMap<String, Integer>();
        romantoArabMap.put("I", 1);
        romantoArabMap.put("IV", 4);
        romantoArabMap.put("V", 5);
        romantoArabMap.put("IX", 9);
        romantoArabMap.put("X", 10);
        romantoArabMap.put("XL", 40);
        romantoArabMap.put("L", 50);
        romantoArabMap.put("XC", 90);
        romantoArabMap.put("C", 100);
        romantoArabMap.put("D", 500);
        romantoArabMap.put("CD", 400);
        romantoArabMap.put("CM", 900);
        romantoArabMap.put("M", 1000);

        for (int i = 0; i < s.length(); i++) {
            if ((i < s.length() - 1) && ( 
                ((String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i+1))).equals("IV")) ||
                ((String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i+1))).equals("IX")) ||
                ((String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i+1))).equals("XL")) ||
                ((String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i+1))).equals("XC")) ||
                ((String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i+1))).equals("CD")) ||
                ((String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i+1))).equals("CM")) 
            ) ) {
                total += romantoArabMap.get(String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i+1)));
                
                i++;
            } else {
                total += romantoArabMap.get(String.valueOf(s.charAt(i)));
            }
        }
        
        // System.out.println(String.valueOf(s.charAt(1)) + String.valueOf(s.charAt(1+1)));

        // return (romantoArabMap.get(s));
        return total;
        
    }
}



