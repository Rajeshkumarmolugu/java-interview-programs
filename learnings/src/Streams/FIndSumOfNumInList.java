package learnings.src.Streams;

import java.util.ArrayList;
import java.util.Arrays;

public class FIndSumOfNumInList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(al.stream().reduce(0,Integer::sum));
    }
}
