class abs_diff {
    public static void main(String[] args) {
        int[] difArr = {25, 35, 10, 90, 45, 0, 65, 55};
        int Diff = 10;
        int temp = 0;

        for (int i = 0; i < difArr.length; i++) {
            for (int j = 0; j < difArr.length - i - 1; j++) {
                if (difArr[j] > difArr[j + 1]) {
                    temp = difArr[j];
                    difArr[j] = difArr[j + 1];
                    difArr[j + 1] = temp;
                }
            }

        }
        for (int i = 0; i <difArr.length ; i++) {
            System.out.print(difArr[i]+" ");
        }

ls.LinearSearch(difArr,Diff);
    }

}
    class ls{
    public static void LinearSearch(int[] difArr,int Diff){
        System.out.println();
        for (int i = 0; i < difArr.length-1; i++) {
            int value=Math.abs(difArr[i]-difArr[i+1]);
            if(value==Diff){


                System.out.println("The pairs are: "+"( "+difArr[i]+" , "+difArr[i+1]+" )");
            }

        }
    }
}
