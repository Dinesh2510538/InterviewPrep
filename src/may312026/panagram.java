package may312026;

public class panagram {
    static void main() {
        String str = "coding right here";
        str = str.toLowerCase();

        if (str.length() < 26) {
            System.out.println("Not a panagram");
            return;
        }

        for (char c = 'a'; c <= 'z'; c++) {
            if (str.indexOf(c) < 0) {
                System.out.println("Not a panagram");
                return;
            }
        }

        System.out.println("It is a panagram");
    }
}
