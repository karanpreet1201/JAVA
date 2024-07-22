import java.util.*;
public class fibbonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = a+b;

        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);

        // Series print 

        for(int i=0;i<number;i++){
            
            System.out.print(" ");
            System.out.print(c);
            a=b;
            b=c;
            c=a+b;
        }


        sc.close();
    }
}
