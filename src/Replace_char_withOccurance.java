import java.util.Arrays;

public class Replace_char_withOccurance {
    public static void main(String[] args) {
        String str="hello";
        char charToReplace='l';

        char[] chr=str.toCharArray();
        int count=1;
        for (int i = 0; i <chr.length ; i++) {
            if(chr[i]==charToReplace){
                chr[i]=String.valueOf(count).charAt(0);
                count++;
            }
        }
        System.out.println(Arrays.toString(chr));
    }
}
