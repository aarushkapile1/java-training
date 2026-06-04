import java.util.Scanner;

public class Numberguessinggamr {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   System.out.println("enter a number between 1 and 100: ");
   int guess = sc.nextInt();
    int number = (int)(Math.random() * 100) + 1;
    while (guess != number) {
        if (guess < number) {
            System.out.println(" low! Try again: ");
        } else {
            System.out.println("high! Try again: ");
        }
        guess = sc.nextInt();
    }
    System.out.println("Congratulations! You guessed the number.");
}
}
