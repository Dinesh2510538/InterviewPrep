package june15;

import java.util.ArrayList;

public class GoodSubArray {
    public static void main(String[] args) {
        int[] A={2,1,2,2,3,2,3,5,1,2,1};//2,2,3,2,3
        int N=11;
        int k=2;

        int maxSum=0;

        for (int left = 0; left <N ; left++) {
            ArrayList<Integer> subArray =new ArrayList<>();
            int sum=0;
            for (int right =left; right <N ; right++) {
                int value=A[right];
                if ((!subArray.contains(value))){
                    subArray.add(value);
                }
                if(subArray.size()>k){
                    break;
                }
                sum+=value;
                if (sum>maxSum){
                    maxSum=sum;
                }
            }
        }

        System.out.println(maxSum);

    }
}
