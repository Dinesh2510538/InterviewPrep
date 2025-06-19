package june19;

public class Vowels {
    public static void main(String[] args) {
        String word="programming";
        StringBuilder sb=new StringBuilder();

        for (int i = 0; i <word.length() ; i++) {
            switch (word.charAt(i)){
                case 'a':
                    sb.append('u');
break; 
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    sb.append(word.charAt(i));
                    break;
                 default:
                     sb.append(word.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
