import java.util.stream.IntStream;

public class print_1to100_noLoop {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,100).forEach(System.out::println);
    }
}
