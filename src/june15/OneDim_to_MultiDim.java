package june15;

public class OneDim_to_MultiDim {
    public static void main(String[] args) {
        int[] oneDim={0,1,0,1,1,0,1,1,1};
        int count=0;
        int C=3;
        int R=3;
        int rowSum=0;
        int max=0;
        int rowMax=0;
        int[][] twoDim=new int[C][R];
        for (int i = 0; i <R ; i++) {
            for (int j = 0; j <C ; j++) {
                twoDim[i][j]=oneDim[count];
                count++;
                System.out.print(twoDim[i][j]);
                System.out.print("\t");
                rowSum+=twoDim[i][j];
            }
            System.out.println("\n");
            if(rowSum>max){
                max=rowSum;
                rowMax=i+1;
            }
        }

        System.out.println("row with maximum space occupied: "+rowMax);



    }
}
