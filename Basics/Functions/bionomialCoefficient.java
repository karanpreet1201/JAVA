import java.util.Scanner;

public class bionomialCoefficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int ans = biocff(n,r);
        System.out.println(ans);

        sc.close();
    }

    public static int biocff(int n , int r)
    {
        int factN = 1;
        for (int i = 1 ; i <= n ; i++)
        {
            factN *= i;
        }


        int factR = 1;
        for (int i = 1 ; i <= r ; i++)
        {
            factR *= i;
        }

        int factN_R = 1;
        for (int i = 1 ; i <= n - r ; i++)
        {
            factN_R *= i;
        }
        
        return (factN/((factR)*(factN_R)));
    }
}
