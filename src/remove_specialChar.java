public class remove_specialChar {
    public static void main(String[] args) {
        String s="@$ Dinesh #@#";
        s=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
    }
}
