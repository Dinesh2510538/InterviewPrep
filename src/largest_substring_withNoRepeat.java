import java.util.LinkedHashMap;
import java.util.Map;

public class largest_substring_withNoRepeat {
    public static void main(String[] args) {
        String str = "aabac";
        Map<Character, Integer> map = new LinkedHashMap<>();

        int maxLength = 0;
        String longestSubstr = "";
        int i = 0;

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);

            if (map.containsKey(ch)) {
                j = map.get(ch);
                map.clear();
                i = j + 1;
            } else {
                map.put(ch, j);

                if (map.size() > maxLength) {
                    maxLength = map.size();
                    longestSubstr = str.substring(i, j + 1);
                }
            }
        }

        System.out.println("Longest substring without repeating characters: " + longestSubstr);
        System.out.println("Length: " + maxLength);
    }
}
