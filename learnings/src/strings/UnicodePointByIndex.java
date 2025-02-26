package learnings.src.strings;

public class UnicodePointByIndex {
    public static void main(String[] args) {
        String s ="rajesh";
        int index = 4;

        System.out.println(s.codePointAt(4));

        //for all chars in a String
        for(int i = 0; i < s.length() ; i++){
            System.out.println("Char is " + s.charAt(i) + " Unicode value is " + s.codePointAt(i));
        }
    }
}
