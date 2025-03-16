package learnings.src.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;

public class FIndLongestString {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(Arrays.asList("rajesh","kumar","rakesh","temp"));

        //to find length
        System.out.println(al.stream().map(a->a.length()).findFirst().get());
        //to
       String name =  al.stream().max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println(name);

        //to print all strings having equal higher length

        //step1 - calculate higher length
        OptionalInt maxLength = al.stream().mapToInt(String::length).max();

        //step2 filter string with same max length
        al.stream().filter(a->a.length()==maxLength.getAsInt()).forEach(System.out::println);
    }
}
