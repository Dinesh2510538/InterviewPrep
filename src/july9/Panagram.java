package july9;

public class Panagram {
    public static void main(String[] args) {
        String str = "The quick brownz fox jumps over the lay dog";
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
