package dec7;

public class panagramm {
    static void main() {
        String str = "java";
        str = str.toLowerCase();

        if (str.length() < 26) {
            System.out.println("Not a pangram");
            return;
        }

        for (char c = 'a'; c <= 'z'; c++) {
            if (str.indexOf(c) < 0) {
                System.out.println("Not a pangram");
                return;
            }
        }

        System.out.println("It is a pangram");
    }
}
