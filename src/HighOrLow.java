import java.util.Random;
import java.util.Scanner;

public class HighOrLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int randomNumber = generator.nextInt(10) + 1; // generates a random number between 1 and 10
        int guess = 0;
        do {
            System.out.print("Guess the number between 1 and 10: ");
            if (in.hasNextInt())
            {
                guess = in.nextInt();
                if (guess < 1 || guess > 10) {
                    System.out.println("Invalid input: " + guess + ". Please enter a number between 1 and 10.");
                }
            }
            else
            {
                System.out.println("Invalid input: Please enter a number between 1 and 10.");
                in.nextLine(); // clear the invalid input
            }
        }
        while (guess < 1 || guess > 10);
        System.out.println("You guessed: " + guess);
        System.out.println("The random number was: " + randomNumber);

        if (guess > randomNumber)
        {
            System.out.println("Your guess is high!");
        }
        else if (guess < randomNumber)
        {
            System.out.println("Your guess is low.");
        }
        else
        {
            System.out.println("Congratulations! You were right on the money: " + randomNumber);
        }

    }
}
