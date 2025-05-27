class replace_sort {

    public static void linearSearch(int[][] inputArr, int N, int replace) {

    for (int i = 0; i < inputArr.length; i++) {
        for (int j = 0; j < inputArr[i].length; j++) {
            if (inputArr[i][j] ==N) {
                inputArr[i][j]=replace;

            }
        }
    }

}
    public static void main(String[] args) {
        int[][] inputArr = {
                {10, 15, 5, 20},
                {20, 30, 10, 40},
                {75, 100, 10, 25}
        };

        int N = 100;
        int K = 101;
        int replace = N + K;
        int temp = 0;
        linearSearch(inputArr, N, replace);

        System.out.println("Replaced array:");
        for (int i = 0; i < inputArr.length; i++) {
            for (int j = 0; j <=inputArr.length; j++) {
                System.out.print(inputArr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Sorted replaced array");

        for (int i = 0; i < inputArr.length; i++) {
            for (int j = 0; j < inputArr[i].length;j++) {
                for (int k = 0; k <inputArr[i].length-j-1 ; k++) {
                    if (inputArr[i][k] > inputArr[i][k + 1]) {
                        temp = inputArr[i][k];
                        inputArr[i][k] = inputArr[i][k + 1];
                        inputArr[i][k + 1] = temp;

                    }

                }
            }

        }

        for (int i = 0; i <inputArr.length ; i++) {
            for (int j = 0; j <inputArr[i].length; j++) {

                System.out.print(inputArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
