package may282026;

class searchInsertPosition35 {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }
}
class Main {
    public static void main(String[] args) {

        searchInsertPosition35 obj = new searchInsertPosition35();

        int[] nums = {1, 3, 5, 6};
        int target = 2;

        int ans = obj.searchInsert(nums, target);

        System.out.println("Insert Position = " + ans);
    }
}