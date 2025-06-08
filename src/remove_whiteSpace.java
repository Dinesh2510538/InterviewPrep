public class remove_whiteSpace {
    public static void main(String[] args) {
        String str="  DINESH   ";
       str=str.replaceAll("\\s","");
        System.out.println("after removing white space: "+str);

    }
}
