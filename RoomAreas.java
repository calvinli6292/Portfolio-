import java.util.Scanner;

public class RoomAreas
{
    public static void main (String [] args)
    {
        double number;
        double totalArea;

        Rectangle kitchen = new Rectangle(12,13);
        Rectangle bedroom = new Rectangle(13,14);
        Rectangle den = new Rectangle (14,15);
        Scanner kb = new Scanner(System.in);

        totalArea =kitchen.getArea() + bedroom.getArea() + den.getArea();
        System.out.println("the total area of the room is " + totalArea);

        System.out.println(  "Rooms" + "\t\t" + "lengths" + "\t\t" + "Widths"+ "\t\t" + "Area");
        System.out.println("------------------------------------------------------------");
        System.out.println( "Kitchen" + "\t\t" + kitchen.getLength() + "\t\t" + kitchen.getWidth() + "\t\t" + kitchen.getArea());
        System.out.println( "Bedroom" + "\t\t" + bedroom.getLength() + "\t\t" + bedroom.getWidth() + "\t\t" + bedroom.getArea());
        System.out.println( "Den" + "\t\t" + den.getLength() + "\t\t" + den.getWidth() + "\t\t" + den.getArea());
    }
}
       
