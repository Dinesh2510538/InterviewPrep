package dec19;

class BinaryCheck {
    public static void main(String[] args) {
        String s = "10101";
        boolean binary = true;

        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) != '0' && s.charAt(i) != '1')
                binary = false;

        System.out.println(binary);
    }
}
