import java.util.Arrays;
import java.util.List;

public class multi_dim_sum_using_arraylist {
    public static void main(String[] args) {
        Integer[] arr ={1, 2, 3, 4, 5, 6, 7, 8};
        List<Integer> inputList=Arrays.asList(arr);
        List<List<Integer>> result=List.of(inputList.stream().filter(i->i%2!=0).toList()
                ,inputList.stream().filter(i->i%2==0).toList());
        System.out.println(result.toString());
    }
}