
/**
 * Write a description of class items here.
 *
 * @author (Ionut Boris)
 * @version v1.0 - 2022
 */
public class Items
{
       String name;
       String description;
       int id;
       
       public Items(String name, String description,int id)
       {
           this.description = description;
           this.name = name;
           this.id = id;
       }
       
       public void getShortDescription()
       {
           System.out.println(name);
       }
       
        public void getLongDescription()
       {
           System.out.println(name + " " + description);
       }
}
