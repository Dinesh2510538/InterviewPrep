public class remove_duplicates {
    public static void main(String[] args) {
        String str="KANNA";
        char[] chr=str.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <chr.length ; i++) {
            boolean repeated=false;
            for (int j = i+1; j <chr.length ; j++) {
                if(chr[i]==chr[j]){
                    repeated=true;
                    break;
                }
            }
            if(!repeated){
                sb.append(chr[i]);

            }

        }
        System.out.println(sb);
    }
}
