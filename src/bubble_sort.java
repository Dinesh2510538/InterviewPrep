public class bubble_sort {
    public static void main(String[] args) {
        int[] a={6,2,5,9,4};
        int temp=0;

        System.out.println("before sort:");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
      try {
          for (int i = 0; i < a.length; i++) {
              for (int j = 0; j < a.length; j++) {
                  if (a[j] > a[j + 1]) {
                      temp = a[j];
                      a[j] = a[j + 1];
                      a[j + 1] = temp;
                  }


              }
          }
      }
        catch(Exception e){
            System.out.println("exception handled"+e.getMessage());
        }
        System.out.println("after sort:");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
