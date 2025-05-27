public class second_largest {
    public static void main(String[] args) {
                int[] a={1,4,8,5,9,10};
                int largeNumber =a[0];
                int middleNumber=a[1];
                for (int i = 1; i <a.length ; i++) {

                    if (a[i]>largeNumber) {
                          largeNumber=a[i];
                    }
                    for(int j=0;j<i;j++){
                            if(largeNumber>a[j]&&largeNumber!=middleNumber){
                                middleNumber=a[j];

                            }
                    }

                }
                System.out.println("The second largest value of this array is: "+middleNumber);
            }
        }

