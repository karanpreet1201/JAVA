import java.util.*;
public class matrixMultiplication 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the row for Matrix 1 :- ");
        int r1 = sc.nextInt();
        System.out.print("Enter the coloumn for Matrix 1 :- ");
        int c1 = sc.nextInt();
        int mat1[][] = new int[r1][c1];

        System.out.print("Enter the row for Matrix 2 :- ");
        int r2 = sc.nextInt();
        System.out.print("Enter the coloumn for Matrix 2 :- ");
        int c2 = sc.nextInt();
        int mat2[][] = new int[r2][c2];

        if (c1 != r2)
        {
            System.out.println("Invalid Multiplication I am going to exit from this ....");
            sc.close();
            return;
        }

        // Taking input of both matrix 
        // Matrix 1 
        for (int i = 0 ; i < r1 ; i++)
        {
            for (int j = 0 ; j < c1 ; j++)
            {
                mat1[i][j] = sc.nextInt();
            }
        }
        // Matrix 2
        for (int i = 0 ; i < r2 ; i++)
        {
            for (int j = 0 ; j < c2 ; j++)
            {
                mat2[i][j] = sc.nextInt();
            }
        }


        // Multiple Matrix
        int product[][] = new int[r1][c2];
        for (int i = 0 ; i < product.length ; i++)
        {
            for (int j = 0 ; j < product[0].length ; j++)
            {
                for (int k = 0 ; k < r2 ; k++)
                {
                    product[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        // Printing product matrix
        for (int i = 0 ; i < product.length ; i++)
        {
            for (int j = 0 ; j < product[0].length ; j++)
            {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();

    }
}
