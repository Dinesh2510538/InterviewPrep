package june16;

public class balloon {
    public static void main(String[] args) {
        int N = 8;
        char[] B = { 'g', 'b', 'b', 'g', 'g', 'y', 'y','y'};



        for (int i = 0; i < N; i++) {
            char oddChar = B[i];
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (B[j] == oddChar) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                System.out.println("First odd balloon color: " + oddChar);
                break;

            }
        }

    }
}

