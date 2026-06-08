package june16;

public class caesarCipher {
    public static void main(String[] args) {

       StringBuilder sb=new StringBuilder("");
        String s="Zebra";
        String t="";
         int key=1;
        for (int i = 0; i <s.length() ; i++) {
            char c=s.charAt(i);

            if(Character.isUpperCase(c)){
                c=(char)('A'+(c-'A'+key)%26);
            }
            else if(Character.isLowerCase(c)){
                c=(char)('a'+(c-'a'+key)%26);
            }
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
