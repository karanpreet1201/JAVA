import java.util.*;
public class stringIntChar {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String str = "abc";

        str += "xyz";
        System.out.println(str);

        str += 'k';
        System.out.println(str);

        str += 69;
        System.out.println(str);


        sc.close();
    }
}
