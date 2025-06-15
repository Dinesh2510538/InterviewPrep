public class char_occurance {
    public static void main(String[] args) {
        String str="My Name is Dinesh Kanna";
        int totalCount=str.length();//length of a full string
        int totalCount_afterRemove=str.replace("a","").length();//length of a string after a char is removed
        int count=totalCount-totalCount_afterRemove;
        System.out.println( "the occurance  number  of character a: "+count);
    }
}
