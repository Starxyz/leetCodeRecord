import java.util.*;

public class Zipper {
    public String zipString(String iniString) {
        // write code here
        int size = countCompression(iniString);
        if (size >= iniString.length())
            return iniString;
        
        StringBuffer mystr = new StringBuffer();
        char last = iniString.charAt(0);
        int count = 1;
        for (int i = 1; i < iniString.length(); i++) {
            if (iniString.charAt(i) == last)
                count++;
            else {
                mystr.append(last);
                mystr.append(count);
                last = iniString.charAt(i);
                count = 1;
            }            
        }
        
        mystr.append(last);
        mystr.append(count);
        return mystr.toString();
    }
    
    private int countCompression(String str) {
        if (str == null || str.isEmpty())
            return 0;
        char last = str.charAt(0);
        int size = 0;
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == last) {
                count++;
            }
            else {
                last = str.charAt(i);
                size += 1 + String.valueOf(count).length();// count maybe > 10 or 100;
                count = 1;
            }
        }
        size += 1 + String.valueOf(count).length();
        return size;
    }
}