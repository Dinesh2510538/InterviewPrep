package may262026;

class lemonChange {

    public boolean lemonadeChange(int[] bills) {

        int five = 0, ten = 0;

        for (int i = 0; i < bills.length; i++) {

            if (bills[i] == 5) {
                five++;
            }

            else if (bills[i] == 10) {
                five--;
                ten++;
            }

            else if (ten > 0) {
                ten--;
                five--;
            }

            else {
                five -= 3;
            }

            if (five < 0) {
                return false;
            }
        }

        return true;
    }
}

public class Main {

    public static void main(String[] args) {

        lemonChange s = new lemonChange();

        int[] bills = {5, 5, 5, 10, 20};

        System.out.println(s.lemonadeChange(bills));
    }
}