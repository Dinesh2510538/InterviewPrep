package dec6;

public class CharFrequency {
    static void main() {
        String s="apple";
        int count=0;
        for(char ch:s.toCharArray())
            if(ch=='p') count++;
        System.out.println(count);

    }
}
