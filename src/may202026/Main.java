package may202026;

import java.util.ArrayList;
import java.util.List;

class KeyboardRow {

    public boolean check(String word) {

        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";

        word = word.toLowerCase();

        String temp = "";

        if (s1.contains(word.charAt(0) + ""))
            temp = s1;
        else if (s2.contains(word.charAt(0) + ""))
            temp = s2;
        else
            temp = s3;

        for (int i = 1; i < word.length(); i++) {

            if (!temp.contains(word.charAt(i) + "")) {
                return false;
            }
        }

        return true;
    }
}

public class Main {

    public static void main(String[] args) {

        String[] words = {"Hello", "Alaska", "Dad", "Peace"};

        KeyboardRow obj = new KeyboardRow();

        List<String> result = new ArrayList<>();

        for (String word : words) {

            if (obj.check(word)) {
                result.add(word);
            }
        }

        System.out.println(result);
    }
}