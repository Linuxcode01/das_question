package LeetCode.Binary_Sorting;

public class SearchA2dArray {

    public static boolean searchMatrix(int[][] matrix, int target) {

        int low = 0;
        int high = (matrix.length) * (matrix[0].length) -1;

        while(low <= high){
            int guess = low + (high - low)/2;
            int row = guess / (matrix[0].length);
            int col = guess % (matrix[0].length);


            if(matrix[row][col] == target) return true;

            if(matrix[row][col] < target) {
                low = guess + 1;
            }else{
                high = guess - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1}};
       boolean ans = searchMatrix(matrix, 2);
        System.out.println(ans);
    }
}
