package learnings.src.Streams;

import java.util.ArrayList;
import java.util.Arrays;

public class FindSquareOfNum {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        al.stream().map(a->a*a).forEach(System.out::println);
    }
}
