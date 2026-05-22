package may222026;

import java.util.*;

class DistributeCandies {

    public int distributeCandies(int[] candyType) {

        int n = candyType.length;
        int unique = 0;

        for (int i = 0; i < n; i++) {

            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (candyType[i] == candyType[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                unique++;
            }
        }

        if (unique < n / 2) {
            return unique;
        }

        return n / 2;
    }
}

public class Main {

    public static void main(String[] args) {

        int[] candyType = {1, 1, 2, 2, 3, 3};

        DistributeCandies obj = new DistributeCandies();

        int ans = obj.distributeCandies(candyType);

        System.out.println(ans);
    }
}
