package LeetCode.Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class K_closest_to_origin_point {
    public static int[][] kClosest(int[][] points, int k) {
        int [][] res = new int[k][2];
        PriorityQueue<Pair> pq = new PriorityQueue<>(
                (a, b) -> Double.compare(b.dist , a.dist)
        );

        for (int i = 0; i < points.length; i++) {
           int x = points[i][0];
           int y = points[i][1];

           double dist = Math.sqrt(x * x + y * y);

           if( i < k){
               pq.offer(new Pair(dist, i));
           }
           else{
               pq.offer(new Pair(dist, i));
               pq.poll();
           }
        }

        int i = 0;
        while (!pq.isEmpty()){
            Pair p = pq.poll();
            int idx= p.idx;
            res[i][0] = points[idx][0];
            res[i][1] = points[idx][1];
            i++;
        }

        return res;
    }

    public static void main(String[] args) {
        int [][] points = new int[][]{{3,3},{5,-1},{-2,4}};
        int k = 2;
        System.out.println(Arrays.deepToString(kClosest(points, k)));

    }
}


class Pair{
    double dist;
    int idx;
    Pair(double d, int i){
        this.dist = d;
        this.idx = i;
    }
}