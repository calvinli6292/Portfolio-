import java.util.Scanner;
import java.util.Random;
/**
 * Calvin Li
 * 2/20/16
 */
public class ScissorGame
{
    public static void main (String [] args)
    {
        String personPlay;
        String botPlay = "";
        int botInt;
        
        Scanner keyboard = new Scanner (System.in);
        Random generate = new Random();
        
        System.out.println("Let's play Rock, Paper, Scissors." + " Please enter a move.\n" + 
                            "Paper = P, Rock = R, Scissor = S");
       
        System.out.println();
	        
	        botInt = generate.nextInt(3)+1;
	        
	        if (botInt == 1)
	            botPlay = "R";
	        else if (botInt == 2)
	            botPlay = "P";
	        else if (botInt == 3)
	            botPlay = "S";        
	       
	        System.out.println("Enter your play: ");
	        personPlay = keyboard.next();
	        
	        
	        System.out.println("The computer's play is: " + botPlay);
	        
	        if (personPlay.equalsIgnoreCase(botPlay))
	            System.out.println("This is a tie game!");
	        
	        if(personPlay.equalsIgnoreCase("R"))
	        {
	            if(botPlay.equalsIgnoreCase("S"))
	                System.out.println("Rock beats scissors. You've won!");
	        	if(botPlay.equalsIgnoreCase("P"))
	                System.out.println("Paper beats rock. You've lost");
	        }
	        
	        if (personPlay.equalsIgnoreCase("P"))
	        {
	                if (botPlay.equalsIgnoreCase("S"))
	                    System.out.println("Scissors beats paper. You've lost");
	                if (botPlay.equalsIgnoreCase("R"))
	                    System.out.println("Paper beats rock. You've won!");
	        }
	                
	         if (personPlay.equalsIgnoreCase("S"))
	         {
	                if(botPlay.equalsIgnoreCase("P"))
	                   System.out.println("Scissors beat paper. You've Won!");
	                if (botPlay.equalsIgnoreCase("R"))
	                        System.out.println("Rock beats scissors. You've lost");
	         }
	         if(!(personPlay.equalsIgnoreCase("S")||personPlay.equalsIgnoreCase("P")||personPlay.equalsIgnoreCase("R")))
                 System.out.println("Invalid input.");
    }
}