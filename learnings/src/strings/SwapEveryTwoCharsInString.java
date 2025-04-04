package learnings.src.strings;

public class SwapEveryTwoCharsInString {

    public static void main(String[] args) {
        String s = "Rajesh";
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length()-1;i +=2){
            sb.append(s.charAt(i+1));
            sb.append(s.charAt(i));
        }

        //if string is not even length append the last char to end
        if(s.length() % 2 != 0) {
            sb.append(s.charAt(s.length() - 1));
        }
        System.out.println(sb.toString());
    }
}
