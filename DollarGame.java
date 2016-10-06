import java.util.Scanner;
/**
 * Calvin Li
 * 2/9/16
 */
public class DollarGame
{
    public static void main (String [] args)
    {
        double numberQuarters, numberDimes, numberNickels, numberPennies;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Let's play a game where you use coins to make an exact dollar");
        
        System.out.println("Enter a certain amount of quarters.");
        numberQuarters = keyboard.nextDouble();
        
        System.out.println("Enter a certain amount of dimes.");
        numberDimes = keyboard.nextDouble();
        
        System.out.println("Enter a certain amount of nickels.");
        numberNickels = keyboard.nextDouble();
        
        System.out.println("Enter a certain amount of pennies.");
        numberPennies = keyboard.nextDouble();
       
        
        if (numberQuarters * 0.25 + numberDimes * 0.10 + numberNickels * 0.05 + numberPennies * 0.01 == 1.00)
            {
                System.out.println("Congratulations you've won the game by adding up to one dollar");
            }
        else 
            {
                System.out.println("Sorry that amount doesn't add up to one dollar");
            }
    }
}
      
        
        
        
   