import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class Random here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DiceRoll
{
    public static void main (String [] args)
    {
        String again = "y";
        int die1, die2, sum;
        
        Scanner keyboard = new Scanner(System.in);
        
        Random rand = new Random();
        
        while(again.equalsIgnoreCase("y"))
        {
            System.out.println("Rolling the dice...");
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
            sum = die1 + die2;
            System.out.println("The values are : ");
            System.out.println(die1 + "+" + die2 + "=" + sum);
            
            System.out.println("Roll thm again (y= yes)? ");
            again = keyboard.nextLine();
        }
    }
}
