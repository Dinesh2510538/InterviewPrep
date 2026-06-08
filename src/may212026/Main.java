package may212026;

import java.util.Arrays;

class relativeRanks {

    public String[] findRelativeRanks(int[] score) {

        int n = score.length;
        String[] answer = new String[n];

        int[] temp = score.clone();
        Arrays.sort(temp);

        for (int i = 0; i < n; i++) {

            int rank = 0;

            for (int j = 0; j < n; j++) {

                if (score[i] == temp[j]) {
                    rank = n - j;
                }
            }

            if (rank == 1) {
                answer[i] = "Gold Medal";
            }
            else if (rank == 2) {
                answer[i] = "Silver Medal";
            }
            else if (rank == 3) {
                answer[i] = "Bronze Medal";
            }
            else {
                answer[i] = String.valueOf(rank);
            }
        }

        return answer;
    }
}

public class Main {

    public static void main(String[] args) {

        int[] score = {10, 3, 8, 9, 4};

        relativeRanks obj = new relativeRanks();

        String[] ans = obj.findRelativeRanks(score);

        System.out.println(Arrays.toString(ans));
    }
}
