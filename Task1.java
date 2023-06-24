import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        int myNumber = 0;
        do {
            System.out.println("Guess the Number.....!!");
            myNumber = sc.nextInt();
            if (myNumber == random) {
                System.out.println("Woohoo...!! Your Guess is Correct.");
                break;
            } else if (myNumber < random) {
                System.out.println("Your Number is too small, Guess again.");
            } else {
                System.out.println("Your Number is too large, Guess again.");
            }
        } while (myNumber >= 0);
        System.out.println("Original Number was: " + random);
    }
}