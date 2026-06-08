package june32026;

import java.util.*;

class AddToArrayForm {

    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();

        for (int i = num.length - 1; i >= 0; i--) {
            k += num[i];
            result.add(0, k % 10);
            k /= 10;
        }

        while (k > 0) {
            result.add(0, k % 10);
            k /= 10;
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {

        int[] num = {1,2,0,0};
        int k = 34;

        AddToArrayForm obj = new AddToArrayForm();

        List<Integer> ans = obj.addToArrayForm(num, k);

        System.out.println(ans);
    }
}