class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            
            // Check for subtraction cases manually by looking ahead
            if (c == 'I' && i + 1 < n && s.charAt(i + 1) == 'V') {
                total += 4;
                i++; // Skip the 'V'
            } else if (c == 'I' && i + 1 < n && s.charAt(i + 1) == 'X') {
                total += 9;
                i++; // Skip the 'X'
            } else if (c == 'X' && i + 1 < n && s.charAt(i + 1) == 'L') {
                total += 40;
                i++; // Skip the 'L'
            } else if (c == 'X' && i + 1 < n && s.charAt(i + 1) == 'C') {
                total += 90;
                i++; // Skip the 'C'
            } else if (c == 'C' && i + 1 < n && s.charAt(i + 1) == 'D') {
                total += 400;
                i++; // Skip the 'D'
            } else if (c == 'C' && i + 1 < n && s.charAt(i + 1) == 'M') {
                total += 900;
                i++; // Skip the 'M'
            } 
            // Handle standard single-character cases
            else if (c == 'I') total += 1;
            else if (c == 'V') total += 5;
            else if (c == 'X') total += 10;
            else if (c == 'L') total += 50;
            else if (c == 'C') total += 100;
            else if (c == 'D') total += 500;
            else if (c == 'M') total += 1000;
        }
        
        return total;
    }
}
