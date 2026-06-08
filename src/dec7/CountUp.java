package dec7;

public class CountUp {
    static void main() {
        String s="JaVa";
        int c=0;
        for(char ch:s.toCharArray())
            if(Character.isUpperCase(ch)){
                c++;
            }
        System.out.println(c);

    }
}
