import java.util.*;
public class nextFibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int a = 0 , b = 1;
        int nextFib = a + b;
        while (nextFib <= number)
        {
            a = b;
            b = nextFib;
            nextFib = a + b;
        }
        System.out.println("The next closest Fibonacci number greater than " + number + " is: " + nextFib);

        sc.close();
    }
}
