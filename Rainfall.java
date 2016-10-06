
/**
 * Write a description of class Rainfall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rainfall
{
    public static void main (String [] args)
    {
    
        String[] months = { "Jan", "Feb", "Mar", "Apr", "May", 
                            "Jun", "Jul", "Aug", "Sep", "Oct",
                            "Nov", "Dec" };
                            
        double[] rain = { 0.40, 0.94, 3.21,
                       3.74, 1.73, 1.03,
                       1.27, 2.58, 6.98,
                       6.90, 2.80, 2.53 };
                       
        System.out.println("Austin Tx \tRainfall 2009");
                       
        for (int index = 0; index < 12; index++)
        {
           System.out.println(months[index] + "\t\t" + rain[index]); 
        }
        
        System.out.println("Total \t\t" + sums(rain));

        System.out.println("Average \t" + average(rain));

        System.out.println("Max \t\t" + max(rain));

        System.out.println("Min \t\t" + min(rain));
    }
    
    public static double sums(double[] rain)
    {
        double sum = 0;
        for (int index = 0; index < 12; index++)
        {
            sum = sum + rain[index];
        }
        
        return sum;
    }
    
    public static double average (double[] rain)
    {
        return sums(rain) / 12;
        
    }
    
    public static double max (double[] rain)
    {
        double high = rain[0];
        for (int index = 0; index < 12; index++)
        {
             if(rain[index] > high)
             {
                high =  rain[index];
             }
        }
        
        return high;
    }
    
    public static double min (double[] rain)
    {
        double low = rain[0];
        for (int index = 0; index < 12; index++)
        {
             if(rain[index] < low)
             {
                low =  rain[index];
             }
        }
        
        return low;
    }
}
