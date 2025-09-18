package learnings.src.dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingLists {

    public static void main(String[] args) {
        int[][] intervals = {{1,5},{2,3},{5,7}};
        List<int[]> merged = mergedIntervals(intervals);

        for (int[] interval : merged) {
            System.out.print(Arrays.toString(interval) + " ");
        }
    }

    private static List<int[]> mergedIntervals(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(a->a[0]));
        int[] current = intervals[0];
        List<int[]> list = new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            int[] next = intervals[i];
            if(next[0] < current[1] ){
                current[1] = Math.max(current[1],next[1]);
            } else {
                list.add(current);
                current=next;
            }
        }
        list.add(current);
        return list;
    }
}
