package dec23;

class RemoveElement {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int key = 3;

        for (int i = 0; i < a.length; i++)
            if (a[i] != key)
                System.out.print(a[i] + " ");
    }
}
