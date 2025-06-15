import java.util.Scanner;

public class count_sum_of_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int number=sc.nextInt();
        int sum=0;
        while (number>0){
            sum=sum+number%10;
            number=number/10;
        }
        System.out.println("The sum of digits in a number:"+sum);
    }
}
