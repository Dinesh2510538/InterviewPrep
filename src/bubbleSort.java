public class bubbleSort {
    public static void main(String[] args) {
        int[] arr={4,3,1,2};

        for (int i =0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("sorted array");
        for (int ars:arr) {

            System.out.print(ars+" ");
        }


    }
}
