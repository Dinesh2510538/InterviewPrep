package may232026;

import java.util.Arrays;

class setMismatch {
    public int[] SetMismatch(int[] nums) {
        int duplicate = -1;
        int missing = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    duplicate = nums[i];
                }
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            boolean flag = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    flag = true;
                }
            }
            if (!flag) {
                missing = i;
            }
        }
        return new int[]{duplicate, missing};
    }
}

    public class main {
        static void main() {
            int[] nums = {1, 2, 2, 4};

            setMismatch obj = new setMismatch();

            int[] ans = obj.SetMismatch(nums);

            System.out.println(Arrays.toString(ans));
        }
    }

