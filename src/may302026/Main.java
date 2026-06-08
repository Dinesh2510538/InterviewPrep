package may302026;

import java.util.*;

class ThirdMax {

    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int max = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != nums[i + 1]) {
                count++;

                if (count == 3) {
                    return nums[i];
                }
            }
        }
        return max;
    }
}

public class Main {
    public static void main(String[] args) {
        ThirdMax obj = new ThirdMax();
        int[] nums = {2, 2, 3, 1};
        int result = obj.thirdMax(nums);
        System.out.println("Third Maximum = " + result);
    }
}