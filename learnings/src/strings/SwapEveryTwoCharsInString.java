package learnings.src.strings;

public class SwapEveryTwoCharsInString {

    public static void main(String[] args) {
        String s = "Rajesh";
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length()-1;i +=2){
            sb.append(s.charAt(i+1));
            sb.append(s.charAt(i));
        }

        System.out.println(sb.toString());
    }
}
