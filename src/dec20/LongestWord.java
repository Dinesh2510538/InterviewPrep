package dec20;

class LongestWord {
    public static void main(String[] args) {
        String s = "Java programming is powerful";
        String[] words = s.split(" ");
        String longest = words[0];

        for (String w : words)
            if (w.length() > longest.length())
                longest = w;

        System.out.println(longest);
    }
}

