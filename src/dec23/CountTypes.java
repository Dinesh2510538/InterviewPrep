package dec23;

class CountTypes {
    public static void main(String[] args) {
        String s = "Java123";
        int upper = 0, lower = 0, digit = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) upper++;
            else if (Character.isLowerCase(ch)) lower++;
            else if (Character.isDigit(ch)) digit++;
        }
        System.out.println( "Uppercase:  " +upper );
        System.out.println( "lowercase:  " +lower );
        System.out.println( "Digit: " + digit);
    }
}

