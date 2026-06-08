package may182026;

public class singleNumber137LeetCode {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                return nums[i];
            }
        }
        return -1;
    }

    static void main() {

        may182026.singleNumber137LeetCode obj = new may182026.singleNumber137LeetCode();

        int[] nums = {4, 4, 4, 1, 1, 1, 2};

        int result = obj.singleNumber(nums);

        System.out.println("Single number is: " + result);
    }
}


