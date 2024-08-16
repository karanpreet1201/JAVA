import java.util.*;


public class loop {
    public static void main(String[] args) {


        // While Loop 


        // int number = 10;
        // while (number <= 100)
        // {
        //     System.out.println("Hello World!!!");
        //     number++;
        // }

        // int number = 0;
        // while (number < 10)
        // {
        //     System.err.println(number);
        //     number++;
        // }

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // int ctr = 1;
        // while(ctr <= number)
        // {
        //     System.out.println(ctr);
        //     ctr++;
        // }

        
        


        // For Loop


        // for (int i = 0 ; i < number ; i++)
        // {
        //     System.out.print(i + " ");
        // }

        // for (int i = 0 ; i < number ; i++)
        // {
        //     for (int j = 0 ; j < number ; j++)
        //     {
        //         System.out.print("*  ");
        //     }
        //     System.out.println();
        // }






        // REVERSE OF A NUMBER 

        // int num = 10899;
        
        // int rev = 0;
        // while(number > 0)
        // {
        //     int lastDigit = number % 10;
        //     rev = (rev * 10) + lastDigit;
        //     number /= 10;

        // }

        // System.out.println(rev);
        






        /// Prime or not 

        boolean isPrime = true;

        for (int i = 2 ; i <= Math.sqrt(number) ; i++)
        {
            if (number % i == 0)
            {
                isPrime = false;
            }
        }

        if (isPrime == true)
        {
            System.out.println(number + " is a prime number ....");
        }
        else
        {
            System.out.println(number + " is not a prime number.....");
        }



        sc.close();

    }
}
