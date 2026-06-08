package sep19;

import java.util.Arrays;

public class ArraysEquality {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8};

        boolean result= Arrays.equals(arr1,arr2);
        if (result==true){
            System.out.println("Arrays are equal");
        }
        else {
            System.out.println("Arrays are not equal");
        }
    }
}
