package aug6;

import java.util.Arrays;

public class Nth_MaxMin {
        public static void main(String[] args) {
            int m = 6; // number of elements
            int n = 2; // nth smallest/largest
            int[] arr = {10, 3, 7, 1, 9, 5};

            Arrays.sort(arr);

            System.out.println(arr[n - 1] + " " + arr[m - n]);
        }
    }

