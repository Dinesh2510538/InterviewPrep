package may252026;

class deleteColumnstoMakeSorted {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        int words = strs.length;
        int wordLen = strs[0].length();

        for (int i = 0; i < wordLen; i++) {

            for (int j = 0; j < words - 1; j++) {

                if (strs[j].charAt(i) > strs[j + 1].charAt(i)) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }

}
public class Main {

    public static void main(String[] args) {

        String[] strs = {"cba", "daf", "ghi"};

        deleteColumnstoMakeSorted obj = new deleteColumnstoMakeSorted();

        int ans = obj.minDeletionSize(strs);

        System.out.println(ans);
    }
}