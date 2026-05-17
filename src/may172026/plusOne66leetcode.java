package may172026;
import java.util.*;
public class plusOne66leetcode {
    static void main() {
        int[] digits = {1, 2, 3};

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                System.out.println(Arrays.toString(digits));
                return;
            }
            digits[i] = 0;
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;

        System.out.println(Arrays.toString(newDigits));

    }
}
