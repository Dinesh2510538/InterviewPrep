package may272026;

class SurfaceArea {
    public int sa(int[][] grid) {
        int area = 0;
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    area += 2;
                    area += 4 * grid[i][j];

                    if (i > 0) {
                        area -= 2 * Math.min(grid[i][j], grid[i - 1][j]);
                    }

                    if (j > 0) {
                        area -= 2 * Math.min(grid[i][j], grid[i][j - 1]);
                    }
                }
            }
        }

        return area;
    }
}

public class Main {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 2},
                {3, 4}
        };
        SurfaceArea obj = new SurfaceArea();

        int ans = obj.sa(grid);

        System.out.println(ans);
    }
}