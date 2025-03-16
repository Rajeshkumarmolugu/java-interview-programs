package learnings.src;

public class ReverseStringWithLogic {

    public static void main(String[] args) {
        String s = "Rajesh";

        //Option 1
        char[] chars = s.toCharArray();

        StringBuilder sb = new StringBuilder();
        for(int i=chars.length-1 ; i>=0 ;i--){
            sb.append(chars[i]);
        }
        System.out.println("Reverse with String Builder is " + sb.toString());

        // Option 2
        String reversed = s.chars().mapToObj(c -> (char) c).collect(StringBuilder::new,StringBuilder::append,StringBuilder::append)
                .reverse()
                .toString();

        System.out.println("reversed " + reversed);
    }

}
