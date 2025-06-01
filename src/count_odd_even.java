import java.util.Scanner;

public class count_odd_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int number=sc.nextInt();

        int evenCount=0;
        int oddCount=0;

        while(number>0){
            int remainder=number%10;

            if(remainder%2==0)
            {
                evenCount++;
            }
            else {
                oddCount++;
            }
            number=number/10;
        }
        System.out.println(" the number of even numbers:"+evenCount);
        System.out.println(" the number of odd numbers:"+oddCount);
     }
}
