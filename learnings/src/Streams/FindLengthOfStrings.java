package learnings.src.Streams;

import java.util.ArrayList;
import java.util.Arrays;

public class FindLengthOfStrings {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(Arrays.asList("rajesh","kiran","magic"));

        //Approach 1
        al.stream().forEach(a-> System.out.println(a + " " + a.length()));

        //Approach 2
        al.stream().map(a->a.length()).forEach(System.out::println);
    }
}
