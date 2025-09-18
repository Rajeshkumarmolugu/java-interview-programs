package learnings.src.Streams;

import java.util.Arrays;

public class FilterEvenNums {
    public static void main(String[] args) {
        Integer[] nums = new Integer[]{1,3,4,5,2,6,7,8,20};
        Arrays.stream(nums).filter(a->a%2==0).forEach(System.out::print);
    }
}
