
/**
 * Write a description of class items here.
 *
 * @author (Ionut Boris)
 * @version v1.0 - 2022
 */
public class Item
{
       private ItemType itemType;
       private String name;
       private int id;
       
       public Item(ItemType type,String name)
       {
           this.itemType = type;
           this.name = name;
           this.id = id;
       }
       
       public String getName()
       {
           return name;
       }
       
       public void getShortDescription()
       {
           System.out.println(name);
       }
       
        public void getLongDescription()
       {
           System.out.println(name + " " + itemType);
       }
       
       public void getItemType(ItemType type)
       {
           return;
       }
}
