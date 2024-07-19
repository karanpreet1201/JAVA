import java.util.*;
public class product {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int firstNumber = sc.nextInt();
    int secondNumber = sc.nextInt();
    int product = firstNumber * secondNumber;
    System.out.println(product);
    sc.close();
    }
}