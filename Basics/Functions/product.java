import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1  = sc.nextInt();
        int num2 = sc.nextInt();

        int ans = prod(num1 , num2);
        System.out.println(ans);

        sc.close();
    }

    public static int prod(int num1 , int num2)
    {
        return num1 * num2;
    }
}
