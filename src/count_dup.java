public class count_dup {
    public static void main(String[] args) {
        String str="KANNA";
        char[] chr=str.toCharArray();
        int count=0;
        for (int i = 0; i <chr.length ; i++) {
            for (int j = i+1; j <chr.length ; j++) {
                if (chr[i] == chr[j]) {
                    count++;
                }
                else {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
