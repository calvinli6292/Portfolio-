import java.util.Scanner;
/**
 * Write a description of class Television here.
 * Calvin Li
 * 3/10/16
 */
public class Television
{
    private String MANUFACTURER;
    private int SCREEN_SIZE;
    private int volume = 20;
    private boolean powerOn;
    private int channel = 2;

    public Television(String brand, int size)
    {
        MANUFACTURER = brand;
        SCREEN_SIZE = size;
    }

    public void setChannel(int station)
    {
        channel = station;
    }

    public void power()
    {
        powerOn = !powerOn;
    }

    public void increaseVolume()
    {
        volume++;
    }

    public void decreaseVolume()
    {
       volume--;
    }

    public int getChannel()
    {
        return channel; 
    }

    public int getVolume()
    {
        return volume;
    }

    public String getManufacturer()
    {
        return MANUFACTURER;
    }

    public int getScreenSize()
    {
        return SCREEN_SIZE;
    }

}
