package june15;

public class Count_star_hash {
    public static void main(String[] args) {
                String s="****###";
                int count_star=0;
                int count_hash=0;
                int diff=0;

        for (int i = 0; i <s.length() ; i++) {
            if ((s.charAt(i))=='*'){
                count_star++;
            }
            else {
                count_hash++;
            }
        }
        diff=count_star-count_hash;
        System.out.println(diff);
    }
}
