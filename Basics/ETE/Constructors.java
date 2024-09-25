import java.util.Scanner;

public class Constructors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Complex com1 = new Complex();
        com1.ComplexInfo(a,b);
        sc.close();
    }
}



class Complex{
    int a ;
    int b;

    void ComplexInfo(int a , int b){
        System.out.println(a + " + " + b + "i");
    }


    public Complex(int a , int b){
        this.a = a;
        this.b = b;
    }

    public Complex(){
        System.out.println("Constructor Called.....");
    }
}