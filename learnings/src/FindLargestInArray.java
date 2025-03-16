package learnings.src;

import java.util.Arrays;

public class FindLargestInArray {
    public static void main(String[] args) {
        int[] num = {1,3,4,6,2,10,20};

        //Approach 1
        int[] sorted = Arrays.stream(num).sorted().toArray();
        System.out.println(sorted[sorted.length-1]);

        //approach 2
        int largest = num[0];
        for(int i=0;i<num.length;i++){
            if(largest < num[i]){
                largest = num[i];
            }
        }
        System.out.println(largest);
    }
}
