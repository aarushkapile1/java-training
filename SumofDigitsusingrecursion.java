import java.util.Scanner;

public class SumofDigitsusingrecursion {
    public static int sumofDigits(int n){
        if(n == 0){
            return 0;
            
        }
        else{
            return n%10 + sumofDigits(n/10);
        }
        
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    System.out.println("Sum of digits of "+n+" = "+sumofDigits(n));
}
}
    
