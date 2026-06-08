package dec11;

public class DuplicateString {
    static void main() {
        String s = "a b a c";
        String[] w = s.split(" ");
        for (int i = 0; i < w.length; i++){
            for (int j = i + 1; j < w.length; j++) {
                if (w[i].equals(w[j])) {
                    System.out.println(w[i]);
                }
            }
        }
    }
}
