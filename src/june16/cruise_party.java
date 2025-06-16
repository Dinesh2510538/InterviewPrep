package june16;

public class cruise_party {
    public static void main(String[] args) {
        int[] E={7,0,5,1,3};
        int[] L={1,2,1,3,4};
        int sum=0;
        int max=0;
        int t=5;

        for (int i = 0; i <t ; i++) {
            sum+=E[i]-L[i];

            if (sum>max){
                max=sum;
            }
        }
        System.out.println(" the maximum number of guests present within "+t+" hours is: "+max);
    }
}
