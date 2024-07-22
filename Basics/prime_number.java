import java.util.*;
public class prime_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int ans =0;
    for(int i=2;i<number;i++){
        if(number%i==0){
            ans=1;
            break;
        }
    }
    if(ans == 1){
        System.out.println("It is not prime");
    }
    else{
        System.out.println("It is prime");
    }
        sc.close();
    }
}
