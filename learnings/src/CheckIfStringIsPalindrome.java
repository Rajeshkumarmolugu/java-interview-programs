package learnings.src;

public class CheckIfStringIsPalindrome {
    public static void main(String[] args) {
        String s ="assa";
        StringBuilder sb = new StringBuilder(s);
        if(s.equals(sb.reverse().toString())){
            System.out.println("Palindrome");
        };
    }
}
