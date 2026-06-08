package june19;

public class IncomeScheme {
    public static void main(String[] args) {
        String parent="Amit";
        boolean childPresent=true;
        String[] child={"Rajesh","Virat"};
        int n=child.length;
        double schemeAmount = 5000;

        if(childPresent==true){
            int parentComission=(int) (0.10 * schemeAmount);
            System.out.println("Amit: "+ n * parentComission);
            for (int i = 0; i <n ; i++) {
                System.out.println(child[i]+": "+(int)(0.05*schemeAmount));
            }

        }
        else {
            for (int i = 0; i <n ; i++) {
                System.out.println(child[i]+": "+(int)(0.05*schemeAmount));
            }
        }
    }
}
