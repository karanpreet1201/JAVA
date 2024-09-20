import java.util.*;
public class pallindromeString {

    public static boolean isPallindrome(String str)
    {
        int i = 0;
        int j = str.length() - 1;
        while(i < j)
        {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        int count = 0;

        for (int i = 0 ; i < str.length() ; i++)
        {
            for (int j = i + 1 ; j <= str.length() ; j++)
            {
                if(isPallindrome(str.substring(i,j)) == true)
                {
                    System.out.print(str.substring(i,j) + " ");
                    count++;
                }
            }
        }
        System.out.print("\n"+count);




     
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // String str = sc.nextLine();
        // int i = 0;
        // int j = str.length()-1;
        // boolean flag = true;
        // while(i < j)
        // {
        //     if (str.charAt(i) != str.charAt(j))
        //     {
        //         flag = false;
        //         break;
        //     }
        //     i++;
        //     j--;
        // }

        // if (flag == true)
        // {
        //     System.out.println("Pallindrome");
        // }
        // else
        // {
        //     System.out.println("Not");
        // }













        // String str = sc.nextLine();
        // StringBuilder gtr = new StringBuilder(str);
        // gtr.reverse();
        // // String s = gtr + ""; // One method 
        // String s = gtr.toString();
        // if (s.equals(str))
        // {
        //     System.out.println("This is pallindrome String");
        // }
        // else
        // {
        //     System.out.println("This is not a pallindrome String");
        // }
        sc.close();
    }
}
