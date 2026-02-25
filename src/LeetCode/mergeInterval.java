package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeInterval {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();


        int start1 = intervals[0][0];
        int end1 = intervals[0][1];

        for (int i = 0; i < intervals.length; i++) {

            int start2 = intervals[i][0];
            int end2 = intervals[i][1];

            if (end1 >= start2) {

                end1 = Math.max(end1, end2);

            } else {
                result.add(new int[] {start1, end1});
                start1 = start2;
                end1 = end2;

            }
        }
        result.add(new int[] {start1, end1});

        return result.toArray(new int[result.size()][]);

    }

    public static void main(String[] args) {
        int [][] arr = new int[][]{{1,3},{2,6},{8,10}};
        System.out.println(Arrays.deepToString(merge(arr)));
    }
}
