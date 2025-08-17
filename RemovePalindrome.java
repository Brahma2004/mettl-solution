import java.io.*;
import java.util.*;

class UserMainCode {
    public int digitRemove_Palin(int input1) {
        String s = String.valueOf(input1);

       
        if (isPalindrome(s)) {
            return -1; 
        }

        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
               
                if (isPalindrome(s.substring(i + 1, j + 1))) {
                    return Character.getNumericValue(s.charAt(i));
                }
                
                else if (isPalindrome(s.substring(i, j))) {
                    return Character.getNumericValue(s.charAt(j));
                }
            }
            i++;
            j--;
        }
        return -1;
    }
     private boolean isPalindrome(String str) {
        int l = 0, r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true ;
    }
}