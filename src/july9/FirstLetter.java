package july9;

public class FirstLetter {
    public static void main(String[] args) {
        String str="Iam Dinesh Kanna";
        String[]words=str.split(" ");
        for (int i = 0; i < words.length ; i++) {
            String s=words[i];
            System.out.print(s.charAt(0)+" ");
        }
    }
}
//public class FirstLetter {
//    public static void main(String[] args) {
//        String str = "Iam Dinesh Kanna";
//
//
//        if (str.length() > 0) {
//            System.out.print(str.charAt(0));
//        }
//
//        for (int i = 1; i < str.length(); i++) {
//            if (str.charAt(i) == ' ' && i + 1 < str.length()) {
//                System.out.print(str.charAt(i + 1)); 
//            }
//        }
//    }
//}