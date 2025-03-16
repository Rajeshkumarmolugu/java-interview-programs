package learnings.src.Streams;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(Arrays.asList("rajesh","rakesh","rakesh","temp"));

        al.stream().distinct().forEach(System.out::println);

    }
}
