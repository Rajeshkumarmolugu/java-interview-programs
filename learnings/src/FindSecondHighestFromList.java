package learnings.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindSecondHighestFromList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(3,4,5,6,2,1,9));

        //to sort using descending order - Option 1
        ArrayList<Integer> newAl = (ArrayList<Integer>) list.stream().
                sorted((a,b) -> b.compareTo(a)).collect(Collectors.toList());

        //to sort using descending order - Option 2

        List<Integer> newAl1 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        //to Sort using ascending order
        List<Integer> newAl2 = list.stream().sorted().collect(Collectors.toList());

        System.out.println(" Second highest " + newAl.get(1));
        System.out.println(" Second highest " + newAl1.get(1));
        System.out.println(" Second highest " + newAl2.get(list.size()-2));
    }
}