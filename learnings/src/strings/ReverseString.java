package learnings.src.strings;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Rajesh";

        //1
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(s).reverse().toString());

        //2
        StringBuilder sb1 = new StringBuilder();
        for(int i=s.length()-1; i>=0;i--){
            sb1.append(s.charAt(i));
        }
        System.out.println(sb1.toString());
    }
}
