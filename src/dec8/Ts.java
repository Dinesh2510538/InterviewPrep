package dec8;

public class Ts {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        int num = 9;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == num) {
                    System.out.println(array[i] + " + " + array[j] + " = " + num);
                }
            }
        }
    }
}
