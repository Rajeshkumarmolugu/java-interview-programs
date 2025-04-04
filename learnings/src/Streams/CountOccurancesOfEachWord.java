package learnings.src.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurancesOfEachWord {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(Arrays.asList("rajesh","rakesh","rakesh","temp"));

        Map<String,Long> countMap = al.stream().
                collect(Collectors.
                        groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countMap );

    }
}