package dec9;

public class Prime {
    static void main() {
        int number=155;
        int count=0;
        if(number>1) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("prime");
            } else {
                System.out.println("not a prime");
            }
        }
    }
}
