import java.util.*;
public class inputArray {
    public static void main(String args[])
    {
        System.out.print("Enter the Size of Array :- ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        System.out.println("Enter the elements of arrat :- ");

        for (int i = 0 ; i < size ; i++)
        {
            arr[i] = sc.nextInt();
        }


        System.out.print("Araay is :- ");

        for (int print : arr)
        {
            System.out.print(print + " ");
        }




        sc.close();
    }
}
