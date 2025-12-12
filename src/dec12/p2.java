package dec12;

public class p2 {
    static void main() {
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (int i = 5; i >=1 ; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
