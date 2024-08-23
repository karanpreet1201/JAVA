import java.util.*;
public class kaprekar {
    public static void main(String[] args) {
        // Input a number 
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // we need to declare some variables..
        int sum , temp = number , a , b , digitOfNumber = 1 , square;
        
        // Number kitne digit ka hai voh check krna h
        while (temp != 0)
        {
            digitOfNumber *= 10;
            temp /= 10;
        }

        square = number * number;
        a = square % digitOfNumber;
        b = square / digitOfNumber;
        sum = a + b ;
        
        if (sum == number)
        {
            System.out.print("It is kaprekar number");
        }
        else
        {
            System.out.print("It is not a Kaprekar number");
        }

        sc.close();
    }
}
