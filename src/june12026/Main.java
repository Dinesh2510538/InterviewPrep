package june12026;

class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 &&
                    (i == 0 || flowerbed[i - 1] == 0) &&
                    (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                n--;
            }
        }
        return n <= 0;
    }
}

public class Main {
    public static void main(String[] args) {

        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;

        CanPlaceFlowers obj = new CanPlaceFlowers();

        System.out.println(obj.canPlaceFlowers(flowerbed, n));
    }
}