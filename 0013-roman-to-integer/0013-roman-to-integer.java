class Solution {
    public int romanToInt(String s) {
        // Pre-process the string to eliminate subtraction rules entirely
        s = s.replace("IV", "IIII");
        s = s.replace("IX", "VIIII");
        s = s.replace("XL", "XXXX");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC");
        s = s.replace("CM", "DCCCC");
        
        int total = 0;
        // Now every single character just gets added up directly
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'M') total += 1000;
            else if (c == 'D') total += 500;
            else if (c == 'C') total += 100;
            else if (c == 'L') total += 50;
            else if (c == 'X') total += 10;
            else if (c == 'V') total += 5;
            else if (c == 'I') total += 1;
        }
        
        return total;
    }
}
