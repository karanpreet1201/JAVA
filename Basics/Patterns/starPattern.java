package Patterns;
import java.util.Scanner;

public class starPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 0 ; i < number ; i++)
        {
            for (int j = 0 ; j < i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}