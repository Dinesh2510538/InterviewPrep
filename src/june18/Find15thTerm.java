package june18;

public class Find15thTerm {
    public static void main(String[] args) {
        int n=8; //0,0,7,6,14,12,21,18,28  -> number series
        int result;

        if(n%2==0){
            result=(n/2)*7; //since 7 is in even index
        }
        else {
            result=(n/2)*6; //since 6 is in odd index
        }
        System.out.println("The 15th term of the number series is: "+result);
    }
}
