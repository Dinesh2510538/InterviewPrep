package dec20;

class ReverseNoLoop {
    public static void main(String[] args) {
        String s = "Java";
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(rev);
    }
}
