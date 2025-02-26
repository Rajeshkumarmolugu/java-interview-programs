package learnings.src.strings;

import java.util.Arrays;

public class PrintFirstLetterOfWord {
    public static void main(String[] args) {
        String s = "This is Rajesh";
        String[] s1 = s.split(" ");

        for(String s2 : s1){
            System.out.println(s2.charAt(0));
        }
    }
}
