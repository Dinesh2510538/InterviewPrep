import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class read_data {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\RDK\\OneDrive\\Desktop\\text.txt.txt");

        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        sc.close();
    }
}
