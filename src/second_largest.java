public class second_largest {
    public static void main(String[] args) {
        int[] a = {11, 4, 8, 5, 9, 10};
        int temp = 0;
        int n=2;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }

            }
        }
        System.out.println("Sorted array: ");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println(a[a.length-n]);

    }
}

