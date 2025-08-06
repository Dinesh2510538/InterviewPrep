package aug6;
import java.util.*;
public class Dealership {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no. dealersship:");
            int dealership = sc.nextInt();
            while (dealership> 0) {
                System.out.println("Enter no. cars:");

                int cars = sc.nextInt();
                System.out.println("Enter no. bikes:");

                int bikes = sc.nextInt();
                System.out.println(cars * 4 + bikes * 2);
                break;
            }
        }
    }

