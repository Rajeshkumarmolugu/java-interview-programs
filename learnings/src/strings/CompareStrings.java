package learnings.src.strings;

public class CompareStrings {
    public static void main(String[] args) {
        String s = "Rajesh";
        String s1 = "Rajesh";
        String s2 = "rajesh";

        System.out.println(s.equals(s1));
        System.out.println(s.equals(s2));
        System.out.println(s==s1);
        System.out.println(s.equalsIgnoreCase(s2));
        System.out.println(s.compareTo(s2));
    }
}
