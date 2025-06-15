import java.util.Random;

public class generate_number {
    public static void main(String[] args) {
        Random number=new Random();//random class
        int random_number= number.nextInt(10);
        System.out.println(random_number);
    }
}
