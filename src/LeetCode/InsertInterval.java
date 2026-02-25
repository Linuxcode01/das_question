package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InsertInterval {

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> result = new ArrayList<>();
        List<int[]> res = new ArrayList<>();
        boolean insert = false;



        for (int i = 0; i < intervals.length; i++) {
            if (insert == false && intervals[i][0] >= newInterval[0]) {
                result.add(newInterval);
                insert = true;
            }
            result.add(intervals[i]);
        }

        System.out.println(Arrays.deepToString(result.toArray(new int[result.size()][])));

        if(!insert){
            result.add(newInterval);
        }
        if(intervals.length == 0){
            result.add(newInterval);
        }

        int start1 = result.get(0)[0];
        int end1 = result.get(0)[1];

        for(int i = 1; i < result.size(); i++){

            int start2 = result.get(i)[0];
            int end2 = result.get(i)[1];

            if(end1 >= start2){
                end1 = Math.max(end1, end2);
            }else{
                res.add(new int[]{start1, end1});
                start1 = start2;
                end1 = end2;
            }

        }
        res.add(new int[]{start1,end1});
        return  res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        int [][] intervals = new int[][]{{1,5}};
        System.out.println(Arrays.deepToString(insert(intervals, new int[]{2, 7})));
    }
}
