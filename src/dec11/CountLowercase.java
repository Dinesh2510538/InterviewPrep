package dec11;

public class CountLowercase {
    static void main() {
        String s="DiNeSh";
        int count =0;
        for(char ch:s.toCharArray())
            if(Character.isLowerCase(ch)) {
                count++;
            }
        System.out.println(count);

    }
}
