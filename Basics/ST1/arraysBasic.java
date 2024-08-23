// import java.util.*;

public class arraysBasic {
    public static void main(String args[])
    {
        // Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();
        // int age[];
        // age = new int[5];


        // int age[] = new int[5];

        // age[0] = 2;
        // age[1] = 12;

        // System.out.println(age[0]);
        // System.out.println(age[1]);
        // System.out.println(age[2]);
        // // System.out.println(age[6]);
        // System.out.println(age.length);


        int arr[] = {10 , 20 , 30 , 40 , 50 , -1};
        // int sum = 0;
        // for (int ans : arr)
        // {
        //     sum += ans;
        // }
        // System.out.println(sum);

        // int min = Integer.MAX_VALUE;
        // for (int mins : arr)
        // {
        //     if (mins < min)
        //     {
        //         min = mins;
        //     }
        // }
        // System.out.println(min);

        int max = Integer.MIN_VALUE;
        for (int number : arr)
        {
            if (number > max)
            {
                max = number;
            }
        }
        System.out.println(max);



        // sc.close();
    }
}
