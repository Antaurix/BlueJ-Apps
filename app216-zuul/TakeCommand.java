
/**
 * This command allows the player to
 * take or pickup an item from a room
 * and carry it around to use somewhere
 * else
 *
 * @author Josh Sweeney
 * @version 2021-08-23
 */

  public class TakeCommand extends ZuulCommand
{
    Item item;
    String itemName;
    
    /**
     * Take an item from a location and add it
     * to the player's inventory.
     */
    public TakeCommand(Game zuul, String item)
    {
        super(zuul);
        this.itemName = itemName;
    }    

    public void execute()
    {
        if(item == null) 
        {
            // if there is no second word, we don't know what to take...
            System.out.println("Take what?");
            return;
        }
        

        Map map = zuul.MAP;
        map.getCurrentLocation().remove(this.itemName);
        zuul.player.addItem(item);
    }
} 



