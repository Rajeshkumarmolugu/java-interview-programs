package learnings.src.strings;

public class RemoveLeadingZero4mString {
    public static void main(String[] args) {
        String s = "00000000000002323232";
        StringBuilder sb = new StringBuilder();

        //using String Builder
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)!='0'){
                sb.append(s.charAt(i));
            }
        }

        System.out.println(sb.toString());

        //using replace
        int count = 0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0' && s.charAt(i+1) =='0'){
                count++;
            } else {
                break;
            }
        }
        System.out.println("Number of Zero's " + ( count+1) );
        StringBuilder sb1 = new StringBuilder(s);
        System.out.println(sb1.replace(0,count+1,"").toString());
    }
}
