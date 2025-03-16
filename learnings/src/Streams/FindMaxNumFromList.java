package learnings.src.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindMaxNumFromList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        //approach 1
        Integer num = al.stream().sorted(Comparator.reverseOrder()).findAny().get();
        System.out.println(num);

        //approach 2
        Integer num1 = al.stream().max(Integer::compare).get();
        System.out.println(num1);

        //approach 3
        Integer num3= al.stream().max(Integer::compare).orElseThrow();
        System.out.println(num3);
    }
}
