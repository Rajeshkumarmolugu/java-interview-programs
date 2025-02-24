package learnings.src.strings;

public class ReplaceCharAtIndex {
    public static void main(String[] args) {
        String s = "This iy Rajesh";
        int index=6;
        char c = 's';
        StringBuilder sb = new StringBuilder();

        // 1
        for(int i =0 ; i<s.length(); i++){
            if(i == index){
                sb.append(c);
            } else {
                sb.append(s.charAt(i));
            }
        }

        //2
        StringBuilder sb1 = new StringBuilder();
        sb1.append(s.substring(0,6)).append(c).append(s.substring(7,s.length()));

        //3
        s = s.substring(0,6)+c+s.substring(7,s.length());

        System.out.println(sb.toString());
        System.out.println(sb1.toString());
        System.out.println(s);
    }
}
