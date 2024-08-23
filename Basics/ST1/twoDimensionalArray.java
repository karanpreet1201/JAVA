import java.util.*;

public class twoDimensionalArray {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // Now everything taking from user 

        System.out.print("Enter the number of rows :- ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of coloumns :- ");
        int coloumns = sc.nextInt();

        int arr[][] = new int[rows][coloumns];

        // Taking input 
        System.out.println("Enter elements :- ");
        for (int i = 0 ; i < arr.length ; i++)
        {
            for (int j = 0 ; j < arr[0].length ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        // Printing array 
        System.out.println("Array elements are :- ");

        for (int i = 0 ; i < rows ; i++)
        {
            for (int j = 0 ; j < coloumns ; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        


















        
        // // 2-D Array
        // Scanner sc = new Scanner(System.in);
        // int marks[][] = new int[3][4];
        // // Taking input 
        // for (int i = 0 ; i < 3 ; i++)
        // {
        //     for (int j = 0 ; j < 4 ; j++)
        //     {
        //         marks[i][j] = sc.nextInt();
        //     }
        // }
        // // Printing 
        // for (int i = 0 ; i < 3 ; i++)
        // {
        //     for (int j = 0 ; j < 4 ; j++)
        //     {
        //         System.out.print(marks[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        
        sc.close();
    }

    
}
