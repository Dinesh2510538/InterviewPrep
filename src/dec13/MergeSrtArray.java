package dec13;

import java.util.Arrays;

public class MergeSrtArray {
    static void main() {
        int[] nums1 ={1,2,3,0,0,0};
        int m=3;
        int[] nums2 ={2,5,6};
        int n=3;
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
        for (int i = 0; i <nums1.length ; i++) {
            System.out.print(nums1[i]+" ");
        }
    }
}
