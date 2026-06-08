package june52026;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int target=7;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("the element " + arr[i] + " is present in the array");

            }
        }
    }
}
