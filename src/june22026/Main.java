package june22026;

import java.util.*;

class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}

public class Main {
    public static void main(String[] args) {
        SortedSquares obj = new SortedSquares();
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = obj.sortedSquares(nums);
        System.out.println(Arrays.toString(result));
    }
}