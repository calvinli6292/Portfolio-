
/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangle
{
    private double width;
    private double length;
    public Rectangle(double len, double w)
    {
        length = len;
        width = w;
      
    }
    public void setWidth(double w)
    {   width = w;
    }
    public void setLength(double len)
    {   length = len;
    }
    public double getWidth()
    {   return width;
    }
    public double getLength()
    {   return length;
    }
    public double getArea()
    {   return length*width;
    }
}

