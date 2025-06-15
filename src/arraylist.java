import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> alist=new ArrayList<>();
        for (int i = 1; i <=10 ; i++) {
            alist.add(i);
        }

        Iterator<Integer> i= alist.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
