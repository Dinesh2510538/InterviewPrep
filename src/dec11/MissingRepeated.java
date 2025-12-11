package dec11;

public class MissingRepeated {
    static void main() {
            int arr[] = {1, 2, 2, 4, 5};
            int n = arr.length;
            int[] freq = new int[n + 1];

            for (int x : arr) {
                freq[x]++;
            }

            for (int i = 1; i <= n; i++) {
                if (freq[i] == 0) System.out.println("Missing = " + i);
                if (freq[i] > 1) System.out.println("Repeated = " + i);

        }
    }
}
