package dec5;

public class MoveZeros {
        public static void main(String[] args) {
            int[] nums = {1, 2, 0, 5, 4, 0};
            int left = 0;

            for(int right = 0; right < nums.length; right++){
                if(nums[right] == 0){
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    left++;
                }
            }

            for(int i = 0; i < nums.length; i++){
                System.out.print(nums[i] + " ");//0 0 1 5 4 2
            }
        }
}
//public class Main {
//    public static void main(String[] args) {
//        int[] nums = {1, 2, 0, 5, 4, 0};
//        int left = 0;
//
//        // move zeros to start
//        for(int right = 0; right < nums.length; right++){
//            if(nums[right] != 0){
//                int temp = nums[left];
//                nums[left] = nums[right];
//                nums[right] = temp;
//                left++;
//            }
//        }
//
//        // print using normal loop (no foreach)
//        for(int i = 0; i < nums.length; i++){
//            System.out.print(nums[i] + " ");//1 5 4 2 0 0
//        }
//    }
//}
