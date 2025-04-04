package learnings.src.list;

import java.util.Arrays;

public class RotateArrayByNum {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,5,6,3,4,5};
        int rotateBy = 4;
        int n = num.length;
        System.out.println("lentgh " + n);
        int times = rotateBy % n;
        System.out.println("times "+ times);
        int[] rotated = new int[n];

        // we have an inbuilt method available to copy the array
        // for time you have to take actual array and need to provide the index from where to start
        // copying in the new array and how many elements are to copy
        // like parent array,start index, new array, new array start index,number of elements to copy
        System.arraycopy(num,n-times,rotated,0,times);
        Arrays.stream(rotated).forEach(System.out::print);

        System.arraycopy(num,0,rotated,times,n-times);
        Arrays.stream(rotated).forEach(System.out::print);
    }
}
