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
    public int SCORE = 100;
    public ArrayList <Items> inventory;
    
    public Player(String name)
    {
        this.name = name;
        energy =  100;
        score = 100;
        inventory = new ArrayList<>();
    }
    
    public void increaseEnergy(int amount)
    {
        energy += amount;
        if(energy > 100)
        energy = 100;
    }
    
    public void decreaseEnergy(int amount)
    {
        energy -= amount;
        if(energy < 10);
        {
            score = 0;
        }
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
    
    public boolean Alive()
    {
        return score > 0;
    }
    
    public boolean Dead()
    {
        return score < 0;
    }
    
    public void addItem(Items item)
    {
        inventory.add(item);
    }
    
    public void printStatus()
    {
        System.out.println("Status");
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
        System.out.println("Energy: " + energy);
    }
}
