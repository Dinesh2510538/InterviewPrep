import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class write_data {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("C:\\Users\\RDK\\Documents\\write.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("Hi i'm Dinesh");
        System.out.println("data is entered");
        bw.close();




    }
}
