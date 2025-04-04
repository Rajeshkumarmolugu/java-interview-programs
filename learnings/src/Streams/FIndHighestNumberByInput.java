package learnings.src.Streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class FIndHighestNumberByInput {
    //for Example find the highest number in a list

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        int input = 5; //means find 5th highest number

        Integer fifthHighest = al.stream().sorted(Comparator.reverseOrder()).skip(input-1  ).findFirst().get();

        System.out.println(fifthHighest);
    }
}
