package aug6;

public class SumForTheFunc {
    public static void main(String[] args) {
        //a3 + a2b + 2a2b + 2ab2 + ab2 + b3.
        int a = 2;
        int b = 3;
        int sum;
        sum = (a + b) * (a + b) * (a + b);
        System.out.println(sum);
    }
}
    