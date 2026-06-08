package may182026;

public class SingleNumber136LeetCode {
    public int singleNumber(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean repeated = false;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                return nums[i];
            }
        }
        return -1;
    }

    static void main() {

        SingleNumber136LeetCode obj = new SingleNumber136LeetCode();

        int[] nums = {4, 1, 2, 1, 2};

        int result = obj.singleNumber(nums);

        System.out.println("Single number is: " + result);
    }
}

