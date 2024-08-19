package Patterns;
import java.util.*;

public class invertedStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();


        for (int i = 0 ; i < number ; i++)
        {
            for (int j = 0 ; j <= number - i - 1 ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }



        sc.close();
    }
}
