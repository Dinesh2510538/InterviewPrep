package may172026;

public class twoSum1LeetCode {
    static void main() {
        int[]nums={2,4,5,3,0};
        int target=5;

        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if(nums[i]+nums[j]==target){
                    System.out.println("["+ i + " , " + j + "]" );
                }

            }
        }
    }
}
