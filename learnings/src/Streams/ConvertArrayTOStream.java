package learnings.src.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ConvertArrayTOStream {
    public static void main(String[] args) {

        int[] num = new int[]{1,2,3,4,5};

        //converting int[] to integer[]
        Integer[] nums = new Integer[num.length];
        for(int i=0;i<num.length;i++){
            nums[i]=num[i];
        }

        //converting integer[] to arrayList
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(nums));
        al.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
