class Triangle {
    public static void main(String[] args) {
        int[] a = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int increment = 0;
        int rowNo = 0;

        while (increment < a.length) {
            for (int i = 0; i <=rowNo; i++) {

                    System.out.print(a[increment] + " ");
                    increment++;
            }
            rowNo++;
            System.out.println();
        }
    }
}
