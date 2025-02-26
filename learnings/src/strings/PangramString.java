package learnings.src.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PangramString {
    public static void main(String[] args) {
        String s ="abcdefghijklmnopqrstuvwxyz";

        List<Character> c = Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
        List<Character> AtoZ = new ArrayList<>();
        if(s.length() < 26){
            System.out.println("Not a Pangram");
        } else {
            for(int i=0; i<=s.length()-1; i++){
                if(c.contains(s.charAt(i)) && !AtoZ.contains(s.charAt(i))){
                    AtoZ.add(s.charAt(i));
                }
            }
            if(AtoZ.size() == 26)
            System.out.println("Its Pangram "  + AtoZ.size());
            else
                System.out.println("Not a Pangram" + "Size is " + AtoZ.size());
        }
    }
}
