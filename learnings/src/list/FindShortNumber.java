package learnings.src.list;

import java.util.Arrays;

public class FindShortNumber {
    public static void main(String[] args) {
        Integer[] num = {23,24,5,6,12,3,4};

        Integer[] nums = new Integer[num.length];
        for(int i=0;i<num.length;i++){
            nums[i]=num[i];
        }
        Arrays.stream(num).min(Integer::compare).get();
        System.out.println(Arrays.stream(nums).min(Integer::compare).get());
        //System.out.println("Smallest number is " + temp);
    }
}
