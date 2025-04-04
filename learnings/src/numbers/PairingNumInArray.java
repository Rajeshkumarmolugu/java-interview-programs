package learnings.src.numbers;

import java.util.HashMap;
import java.util.Map;

public class PairingNumInArray {
    public static void main(String[] args) {
        int[] num = {9,3,4,5,6,3,9,5,6};
        HashMap<Integer,Integer> nums = new HashMap<>();
        for (Integer n : num){
            nums.put(n, nums.getOrDefault(n,0) + 1);
        }

        System.out.println(nums);
        for(Map.Entry<Integer,Integer> entry : nums.entrySet()){
            if(entry.getValue() == 1 ){
                System.out.println(entry.getKey());
            }
        }


    }
}
