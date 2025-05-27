class Multidim {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int evenCount = 0;
        int oddCount = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }


        int[] evenArr = new int[evenCount];
        int[] oddArr = new int[oddCount];

        int e = 0;
        int o = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenArr[e++] = arr[i];

            } else {
                oddArr[ o++] = arr[i];

            }
        }


        int[][] finalArr = new int[2][];
        finalArr[0] = oddArr;
        finalArr[1] = evenArr;


        for (int i = 0; i < finalArr[0].length; i++) {

            System.out.print(finalArr[0][i] + " ");
        }

        for (int j = 0; j < finalArr[1].length; j++) {
            System.out.print(finalArr[1][j] + " ");
        }




    }
}
