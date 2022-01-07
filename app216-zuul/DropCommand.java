
/**
 * This command allows the player to
 * take or pickup an item from a room
 * and carry it around to use somewhere
 * else
 *
 * @author Derek Peacock & Nicholas Day
 * @version 2021-08-23
 */
public class DropCommand extends ZuulCommand
{
    String item;
    
    /**
     * Take an item from a location and add it
     * to the player's inventory.
     */
    public DropCommand(Game zuul, String item)
    {
        super(zuul);
        this.item = item;
    }    

    public void execute()
    {
        if(item == null)
        {
          System.out.println("you don't have this item ! ");  
          return;
        }
        else
        {
            System.out.println("You just droped the following item: " + item);
            inventory.remove(item);
        }

        Map map = zuul.MAP;
    }
}
