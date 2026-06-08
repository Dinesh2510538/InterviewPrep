package june16;

public class jarOfCandies {
    public static void main(String[] args) {

        int N = 10;
        int K = 5;
        int number = 3;
        int remaining_candies = N - number;

        if (number>=1 && number<=5){
            System.out.println("NUMBER OF CANDIES SOLD: "+number);
            System.out.println("NUMBER OF CANDIES LEFT: "+remaining_candies);
        }

        else{
            System.out.println("INVALID INPUT");
        }
    }
}