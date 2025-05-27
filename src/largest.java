 class largest {
    public static void main(String[] args) {
        int[] a={1,4,8,5,9,10};
        int largeNumber =a[0];
        for (int i = 1; i <a.length ; i++) {
            if (a[i]> largeNumber) {
                   largeNumber=a[i];
            }


        }
        System.out.println("The largest value of this array is: "+largeNumber);
    }
}
