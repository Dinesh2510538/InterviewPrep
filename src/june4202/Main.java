package june4202;

class SmallestRange {
    public int smallestRangeI(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return Math.max(0, max - min - 2 * k);
    }
}
public class Main {
    public static void main(String[] args) {
        SmallestRange sr = new SmallestRange();
        int[] nums2 = {0, 10};
        System.out.println(sr.smallestRangeI(nums2, 2));

    }
}
