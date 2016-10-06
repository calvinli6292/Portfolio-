import java.util.Scanner;
import java.util.Random;
/**
 * Calvin Li
 * 2/16/16
 */
public class LargestandSmallest
{
    public static void main (String [] args)
    {
        int smallest, largest, num;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a random number: ");
        num = keyboard.nextInt();
        
        smallest = num;
        largest = num;
        
        do
        {
            System.out.print("Enter another number or enter -99 to show smallest and largest values: ");
            num = keyboard.nextInt();

            if (num != -99)
            {
                if (num > largest)
                    largest = num;
                if (num < smallest)
                    smallest = num;  
            }
        } while (num != -99);

        System.out.println("The smallest number is : " + smallest + ".");
        System.out.println("The largest number is : " + largest + ".");
    }
}
            
        
