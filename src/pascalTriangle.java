public class pascalTriangle {
    public static void main(String[] args) {
        int rows = 5;
        int totalCount = 0;
        int startingValue = 1;
        int x = 0;
        System.out.println("total count:");

        for (int i = 0; i < rows; i++) {
            int increment = i + 1;
            totalCount = totalCount + increment;

        }
        System.out.println(totalCount);
        int[] output = new int[totalCount];
        for (int i = 0; i < rows; i++) {

            if (i - 2 < 0) {
                for (int j = 0; j < i + 1; j++) {

                    output[x] = startingValue;
                    x++;
                }

            } else {
                for (int j = 0; j < i + 1; j++) {
                    if (j == 0 || i == j) {
                        output[x] = startingValue;
                        x++;
                    } else {
                        output[x] = output[x - i] + output[x - i - 1];
                        x++;
                    }

                }
            }
        }
        int y = 0;
        System.out.println("pascal triangle:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i + 1; k++) {
                System.out.print(output[y] + " ");
                y++;
            }
            System.out.println();
        }
        }
    }

