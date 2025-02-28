package learnings.src.strings;

import java.lang.reflect.Array;
import java.util.*;

public class LongestPalindromeSubstring {

    public static void main(String[] args) {
        String s = "babaabaab";
        int n = s.length();
        System.out.println(isPalindrome(s));
        HashSet<String> subStrList = new HashSet<>();
        //String longest = "";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = s.substring(i, j);
                if (isPalindrome(sub)
                        && sub.length() !=1 && sub.length() !=n) {
                    subStrList.add(sub);
                }
            }
        }
        System.out.println("list of Palindrome Substrings : " + subStrList);

        String maxLength = "";
        for(String s1  : subStrList) {
           if (s1.length() > maxLength.length() ){
               maxLength = s1;
            }
        }
        System.out.println("Longest Palindrome Substring is " + maxLength);

    }

    public static boolean isPalindrome(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
