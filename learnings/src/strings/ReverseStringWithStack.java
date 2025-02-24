package learnings.src.strings;

import java.util.Stack;

public class ReverseStringWithStack {
    public static void main(String[] args) {
        String s = "Rajesh";
        Stack<Character> st = new Stack<Character>();
        for(char c : s.toCharArray()){
            st.push(c);
        }
        System.out.println(st);
        String str ="";
        for(int i = st.size() -1 ; i >=0 ; i--){
            str += st.pop();
        }
        System.out.println(st);
        System.out.println(str);
    }
}
