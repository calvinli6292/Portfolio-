import java.util.Scanner;
import java.io.*;
/**
 * Calvin Li
 * 2/27/16
 */
public class DepositandWithdrawal
{
    public static void main (String [] args) throws IOException
    {
        double totalDeposit = 3475.37;
        double totalWithdrawal = 234.56;
        
        Scanner keyboard = new Scanner (System.in);
        PrintWriter depositFile = new PrintWriter ("Deposit.txt");
        depositFile.println("100.00");
        depositFile.println("124.00");
        depositFile.println("74.92");
        depositFile.println("37.55");
        depositFile.println();
        
        
        PrintWriter withdrawalFile = new PrintWriter("Withdrawal.txt");
        withdrawalFile.println("29.88");
        withdrawalFile.println("110.00");
        withdrawalFile.println("27.52");
        withdrawalFile.println("50.00");
        withdrawalFile.println("12.90");
        withdrawalFile.println();
        
        File deposit = new File ("Deposit.txt");
        Scanner inputDepositFile = new Scanner(deposit);
        while(inputDepositFile.hasNext())
        {  
            double number = inputDepositFile.nextDouble();
            totalDeposit = totalDeposit + number;
        }
        inputDepositFile.close();
        System.out.println("The total deposit is: $ " + totalDeposit);
        File withdrawal = new File ("Withdrawal.txt");
        Scanner inputWithdrawalFile = new Scanner(withdrawal);
        
        while(inputWithdrawalFile.hasNext())
        {
            double value = inputWithdrawalFile.nextDouble();
            totalWithdrawal = totalWithdrawal + value;
        }
        inputWithdrawalFile.close();
        System.out.println("The total withdrawal is: $ " + totalWithdrawal);
    }
}
    
