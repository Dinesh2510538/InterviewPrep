package june16;

public class runningTest {
    public static void main(String[] args) {
        int[] q={92,91,95,84,89,91,99,96,97};
          int count=0;
          int r=3;
          int c=3;
          int[][] twoD=new int[r][c];
        for (int i = 0; i < r ; i++) {
            for (int j = 0; j < c ; j++) {
                     twoD[i][j]=q[count];
                     count++;

                System.out.print(twoD[i][j]);
                System.out.print("\t");
            }
            System.out.println("\n");
        }


        int[] avg=new int[3];
        int max=0;

        for (int i = 0; i <r ; i++) {
            int sum=0;
            for (int j = 0; j <c ; j++) {
                sum+=twoD[i][j];
            }
            avg[i]=sum/c;
            if (avg[i]>max){
                max=avg[i];
            }
        }
        for (int i = 0; i <3 ; i++) {
            if (avg[i]==max){
                System.out.println("The trainee " +(i+1)+" is fitest of others");
            }
            if(avg[i]<70){
                System.out.println("unfit");
            }
        }




    }
}
