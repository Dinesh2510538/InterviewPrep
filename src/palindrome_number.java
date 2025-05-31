import java.util.Scanner;

public class palindrome_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        int original_number=number; //as after loop ends "number" becomes 0
        int rev=0;
        while(number!=0){
            rev=rev*10+number%10;
            number=number/10;

        }
        if(original_number==rev){
            System.out.println(rev+" It is a Palindrome number");
        }

        else{
            System.out.println("It is not a Palindrome number");
        }
    }
}
