import java.util.ArrayList;
/**
 * Write a description of class Player here.
 *
 * @author Ionut Florin Boris
 * @version v1.0 2022
 */
public class Player
{
    private String name;
    private int energy;
    private int score;
    
    public int ENERGY = 100;
    public int SCORE = 100;
    public ArrayList <Item> items;
    
    public Player(String name)
    {
        this.name = name;
        energy =  50;
        score = 50;
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
        if(energy < 10)
            score = 0;
        
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
    
    public void addItem(Item item)
    {
       //this.item = item;
       //if(item.getItemType()==ItemType.KEY)
       //{
       //score +=10;
       }
    
    
    public void printStatus()
    {
        System.out.println("Status");
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
        System.out.println("Energy: " + energy);
    }
}
