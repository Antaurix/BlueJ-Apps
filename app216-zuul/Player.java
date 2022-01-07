import java.util.ArrayList;
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    private String name;
    private int energy;
    private int score;
    
    public int ENERGY = 100;
    public int SCORE = 200;
    public ArrayList <Items> inventory;
    
    public Player(String name)
    {
        this.name = name;
        energy =  ENERGY;
        score = 0;
        inventory = new ArrayList<>();
    }
    
    public String getInventory()
    {
        String inventoryString = " ";
        for (Items item : inventory)
        {
            inventoryString += item.toString() + ", ";
        }
        return inventoryString;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void printStatus()
    {
        System.out.println("Status");
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
        System.out.println("Energy: " + energy);
    }
}
