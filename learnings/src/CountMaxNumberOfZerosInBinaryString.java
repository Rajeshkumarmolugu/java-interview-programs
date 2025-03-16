package learnings.src;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CountMaxNumberOfZerosInBinaryString {
    public static void main(String[] args) {
        System.out.println(solution(150303));
    }

    public static int solution(int N) {
        String binary = Integer.toBinaryString(N);
        System.out.println(binary);
        char[] nums = binary.toCharArray();
        int count = 0;
        boolean counting = false;
        List<Integer> gaps = new ArrayList<>();
        for(char num : nums){
            if(num == '1'){
                if(counting){
                    gaps.add(count);
                }
                count =0;
                counting = true;
            } else {
                count ++;
            }
        }
        gaps.sort(Comparator.reverseOrder());
        if(gaps.size() > 0){
            return gaps.get(0);
        } else {
            return 0;
        }
    }
}
