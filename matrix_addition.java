
import java.util.Scanner;

public class matrix_addition{
    public static void main(String[] args) {
        int i,j,n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the matrix order :");
        n = in.nextInt();

        int mat1[][]=new int[n][n];
        int mat2[][]=new int[n][n];
        int res[][]=new int[n][n];

        System.out.println("Enter the elements of the first matrix :");

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                mat1[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix :");

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                mat2[i][j]=in.nextInt();
            }
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("The Sum of the matrix is:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(res[i][j] + "\t");
            }
            System.out.println();
        }
        in.close();
    }
}