public class char_withOccurance {
    public static void main(String[] args) {
        String str="KANNA";
        int[] occ=new int[256];
        for (int i = 0; i <str.length() ; i++) {
            char chr=str.charAt(i);
            occ[chr]++; System.out.println("The occurance of character "+"'"+chr+"'"+" : "+occ[chr]); // o/p K-1 A-1 N-1 N-2 A-2
        }

      //  Map<Character,Integer> map=new HashMap<>();
        //        char[] chr=str.toCharArray();
        //        for (char ch:chr) {
        //            if(!map.containsKey(chr)){
        //                map.put(ch,1);
        //            }
        //            else {
        //                int count= map.get(chr);
        //                map.put(ch,count+1);
        //            }
        //        }
        //        System.out.println(map); o/p: K-1,A-2,N-2
    }
}
