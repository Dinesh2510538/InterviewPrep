package dec20;

class HarshadNumber {
    public static void main(String[] args) {
        int n = 18, sum = 0, temp = n;// 18=> 1+8=9  divides 18

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(temp % sum == 0);
    }
}
