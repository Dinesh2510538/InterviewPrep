class Problem2 {
    public static void main(String[] args) {
        int[] inputArr = {4, 5, 6, 7, 8};
        int n = inputArr.length;
        int[][] finalArr = new int[n - 1][];


        for (int i = 0; i < n - 1; i++) {
            int a = inputArr[i];
            int b = inputArr[i + 1];
            int[] c = {a, b, a + b};
            finalArr[i] = c;
        }


        for (int i = 0; i < finalArr.length; i++) {
            for (int j = 0; j < finalArr[i].length; j++) {
                System.out.print(finalArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
