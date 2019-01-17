import java.util.*;

public class Zipper {
    public String zipString(String iniString) {
        // write code here
        String mystr = "";
        char last = iniString.charAt(0);
        int count = 1;
        for (int i = 1; i < iniString.length(); i++) {
            if (iniString.charAt(i) == last) {
                count++;
            }
            else {
                mystr += last + "" + count;
                last = iniString.charAt(i);
                count = 1;
            }
        }
        if ((mystr + last + count).length() >= iniString.length())
            return iniString;
        return mystr + last + count;
    }
}
