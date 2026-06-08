package june18;

public class Nth {

        public static void main(String[] args) {
            int n=2; //0, 0, 2, 1, 4, 2, 6, 3, 8, 4, 10, 5, 12, 6, 14, 7, 16, 8  -> number series
            int result=0;

            if(n%2==0){
                result=(n/2)*2; //since *2 is in even index
            }
            else {
                result++; //increment in odd index
            }
            System.out.println("The nth term of the number series is: "+result);
        }
    }
