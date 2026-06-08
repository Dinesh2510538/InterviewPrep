package aug13;

public class transpose {
    public static void main(String[] args)
{
    int A[][] = { { 1, 1, 1, 1 },
                  { 2, 2, 2, 2 },
                  { 3, 3, 3, 3 } };

    int rows=A[0].length;
    int cols=A.length;

    System.out.print("Result matrix is \n");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++)
            System.out.print(A[j][i] + " ");
        System.out.print("\n");
    }
}
}
