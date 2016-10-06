import java.util.Scanner;
/**
 * Write a description of class ChargeAccountValidation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChargeAccountValidation
{
    public static void main (String [] args)
    {
        int[] accounts = { 11111, 22222, 33333, 44444,
                           55555, 66666, 77777, 88888,
                           99999, 10101, 20202, 30303,
                           40404, 50505, 60606, 70707, 
                           80808, 90909 };
        boolean found; 
        int my_number;
        
        System.out.println("Eenter a charge account number: ");
        
        Scanner keyboard = new Scanner(System.in);
        my_number = keyboard.nextInt();
                           
        found = sequentialSearch(accounts, my_number);
         
        if (found)
        {
            System.out.println("Valid");
        }else {
            System.out.println("Invalid");
        }
    }
    
    public static boolean sequentialSearch (int[] array, int query)
    {
        int index, element;
        boolean found;
        
        index = 0;
        
        found = false;
        
        while (!found && index < array.length)
        {
            if (array[index]  == query)
            {
                found = true;
            }
            index++;
        }
        return found;
    }
}
