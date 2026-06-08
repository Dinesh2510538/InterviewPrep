package dec10;

import java.util.Arrays;

public class Nth {
    static void main() {
        int m = 6;
        int n = 4;
        int[] arr = {10, 3, 7, 1, 9, 5};

        Arrays.sort(arr);

        System.out.println(arr[n - 1] + " " + arr[m - n]);
    }
}
