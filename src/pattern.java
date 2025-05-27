public class pattern {
    public static void main(String[] args) {
        int [][] a=new int[4][];
        int inc=0;
        String pattern="*";
        for (int i=0;i< a.length;i++){
            for (int j=0;j<=i;j++){
                System.out.print(pattern);
            }

            System.out.println();
        }
    }
}
