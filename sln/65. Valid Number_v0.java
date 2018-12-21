class Solution {
    public boolean isNumber(String s) {
        
        int i = 0;
        int n = s.length();
        while (i < n && Character.isWhitespace(s.charAt(i)))
            i++;    // skip whitespace
        
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-'))
            i++;    // skip plus or minus
        
        boolean isNumeric = false;
        while (i < n && Character.isDigit(s.charAt(i)))
        {
            i++;
            isNumeric = true;
        }
        
        if (i < n && (s.charAt(i) == '.' || (i != 0 && s.charAt(i) == 'e')))    // handle fractional part
        {
            i++;
            while (i < n && Character.isDigit(s.charAt(i)))
            {
                i++;
                isNumeric = true;
            }
        }
        
        while (i < n && Character.isWhitespace(s.charAt(i)))
            i++;    // ensure there is no other character
        return isNumeric && i == n;
    }
}