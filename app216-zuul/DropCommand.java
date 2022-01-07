
/**
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
        }
        else
        {
            System.out.println("You just droped the following item: " + item);
            remove(Player.item);
        }

        Map map = zuul.MAP;
    }
}

