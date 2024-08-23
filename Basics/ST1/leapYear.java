import java.util.*;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 100 == 0 && num % 400 == 0 || num % 100 != 0 && num % 4 == 0)
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not leap year");
        }

        sc.close();
    }
}
