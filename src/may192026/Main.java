package may192026;

import java.util.ArrayList;

class LeaderFinder {

    public ArrayList<Integer> findLeaders(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boolean leader = true;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }

            if (leader) {
                ans.add(arr[i]);
            }
        }

        return ans;
    }
}

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 6, 1, 3, 1};

        LeaderFinder obj = new LeaderFinder();
        ArrayList<Integer> result = obj.findLeaders(arr);

        System.out.println("Leaders in array: " + result);
    }
}