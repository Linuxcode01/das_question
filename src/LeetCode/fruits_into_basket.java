package LeetCode;
import java.util.HashMap;

public class fruits_into_basket {
    public static int totalFruit(int[] fruits) {
        int low = 0;
        int high = 0;
        int res = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();

        while(high < fruits.length){
            map.put(fruits[high], map.getOrDefault(fruits[high], 0) + 1);

            while(map.size() > 2){
                map.put(fruits[low], map.get(fruits[low]) - 1);

                if(map.get(fruits[low]) == 0){
                    map.remove(fruits[low]);
                }

                low++;
            }
            int len = high - low + 1;
            res = Math.max(len ,res);

            high++;
        }

//        while (high < fruits.length) {
//
//            map.put(fruits[high], map.getOrDefault(fruits[high], 0) + 1);
//
//            while (map.size() > 2) {
//                map.put(fruits[low], map.get(fruits[low]) - 1);
//
//                if (map.get(fruits[low]) == 0) {
//                    map.remove(fruits[low]);
//                }
//                low++;
//            }
//            int len = high - low + 1;
//            res = Math.max(res, len);
//
//            high++;
//        }

        return res;
    }

    public static void main(String[] args) {
        int ans = totalFruit(new int[]{0,1,2,2});
        System.out.println(ans);
    }
}
