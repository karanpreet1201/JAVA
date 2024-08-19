package Patterns;
import java.util.*;

public class characterPattern {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        char ch ='A';

        for (int i = 0 ; i < number ; i ++)
        {
            for (int j = 0 ; j <= i ; j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

        sc.close();
    }
}
