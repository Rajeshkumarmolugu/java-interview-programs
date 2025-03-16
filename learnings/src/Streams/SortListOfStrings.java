package learnings.src.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortListOfStrings {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(Arrays.asList("Rajesh","Testing","Kumar","Rakesh"));

        //to print in normal order
        al.stream().sorted().forEach(System.out::println);

        //to print in reverse order
        al.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //sort by length of the string in descending order
        al.stream().map(a->a.length()).sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //sort by length of the string in ascending order
        al.stream().map(a->a.length()).sorted().forEach(System.out::println);

        //sort by length and print string name along with length in output
        al.stream().sorted(Comparator.comparingInt(String::length)).forEach(name-> System.out.println(name + " " + name.length()));

        //sort by length and print string name along with length in output with reverse order
        al.stream().sorted(Comparator.comparingInt(String::length).reversed()).forEach(name-> System.out.println(name + " " + name.length()));

    }
}
