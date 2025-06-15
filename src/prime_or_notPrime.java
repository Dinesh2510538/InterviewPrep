public class prime_or_notPrime {
    public static void main(String[] args) {
        int number=5;
        int count=0;
if(number>1){
        for (int i = 1; i <=number ; i++) {
            if(number%i==0){
                count++;
            }
        }
        if(count==2){// as prime shld have 2 divisors 1 and itself
            System.out.println("prime");
        }
        else {
            System.out.println("not a prime");
        }
    }
  }
}