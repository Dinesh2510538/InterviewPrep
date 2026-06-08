public class SearchNumber {
    public static void main(String[] args) {
        int[] n={4,5,6,8,9,10};
        int userInput=6;
        int flag=0;


        for (int i = 0; i <n.length ; i++) {
            if(n[i]==userInput){
                flag=1;
                break;
            }

            }
        if (flag==1){
            System.out.println("number present");
        }
        else {
            System.out.println("number not present");
        }

    }


}

