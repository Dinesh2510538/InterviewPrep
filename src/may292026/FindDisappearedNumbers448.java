package may292026;

import java.util.*;

public class FindDisappearedNumbers448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] present = new boolean[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            present[nums[i]] = true;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (present[i] == false) {
                ans.add(i);
            }
        }

        return ans;
    }
}

class Main {
    public static void main(String[] args) {

        int[] nums = {4,3,2,7,8,2,3,1};

        FindDisappearedNumbers448 obj = new FindDisappearedNumbers448();

        List<Integer> result = obj.findDisappearedNumbers(nums);

        System.out.println(result);
    }
}