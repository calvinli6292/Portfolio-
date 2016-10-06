import java.util.Scanner;
/**
 * Calvin Li
 * 2/16/16
 */
public class GuessGame
{
    public static void main (String [] args)
    {
        int hiddenNumber;
        
        hiddenNumber = (int)(Math.random() * 99 + 1);
        Scanner keyboard = new Scanner(System.in);
        int guess;
        
        do
        {
            System.out.println("Enter a whole number between 1-100: ");
            guess = keyboard.nextInt();
            if(guess == hiddenNumber)
                System.out.println("Congratulations. You've found the hidden number.");
            else if(guess > hiddenNumber)
                System.out.println("This number is greater than the hidden number.");
            else if(guess < hiddenNumber)
                System.out.println("This number is smaller than the hidden number.");
        }while(guess != hiddenNumber);
    }
}
