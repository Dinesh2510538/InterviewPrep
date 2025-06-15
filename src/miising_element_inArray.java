public class miising_element_inArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,5};
        int sum1=0;
        int sum2=0;
        for (int i = 0; i < arr.length ; i++) {
            sum1=sum1+arr[i];

        }

        for (int i = 0; i <=5 ; i++) {
          sum2 = sum2+i;
        }
        System.out.println("the missing element is:"+(sum2-sum1));
    }
}
