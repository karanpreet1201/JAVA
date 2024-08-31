import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sumOfnumber(a,b);
        System.out.println(sum);
        sc.close();
    }

    public static int sumOfnumber(int a , int b)
    {
        return a + b;
    }
}
