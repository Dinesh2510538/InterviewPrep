package sep18;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                n++;
            } else if (n > 0) {
                int t = nums[i];
                nums[i] = 0;
                nums[i - n] = t;
            }

        }
        for (int i = 0; i <nums.length ; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
