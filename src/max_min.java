public class max_min {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,9};
        int max=1;
        int min=1;

        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println("the maximum element present in the array:"+max);


        for (int i =1; i < arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println("the minimum element present in the array:"+min);
    }
}
