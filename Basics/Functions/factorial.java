import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int fact = facto(number);
        System.out.println(fact);

        sc.close();
    }


    public static int facto(int number)
    {
        int fact = 1;
        for (int i = 1 ; i <= number ; i++)
        {
            fact *= i;
        }
        return fact;
    }
}
