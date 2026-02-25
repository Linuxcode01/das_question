package LeetCode.Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Top_K_Frequent_Elements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] res = new int[k];
        PriorityQueue<Pairs> pq = new PriorityQueue<>(
                (a, b) -> a.freq - b.freq
        );

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        map.forEach((s,freq)->{
            if(pq.size()<k){
                pq.offer(new Pairs(s,freq));
            }else {
                pq.offer(new Pairs(s, freq));
                pq.poll();
            }
        });
        int i =0;
        while(!pq.isEmpty()){
            Pairs pair = pq.poll();
            res[i] = pair.element;

        }
        return res;
    }

    public static void main(String[] args) {

    }
}

class Pairs{
    int element;
    int freq;
    Pairs(int e, int f){
        this.element = e;
        this.freq = f;
    }
}