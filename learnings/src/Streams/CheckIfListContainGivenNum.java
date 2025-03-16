package learnings.src.Streams;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckIfListContainGivenNum {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,22,34,55));
        int givenNum = 20;

        //check if list contains greater than giver num
        System.out.println(al.stream().anyMatch(a->a>givenNum));
    }
}
