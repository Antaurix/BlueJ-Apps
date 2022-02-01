
/**
 * Write a description of class ItemType here.
 *
 * @author Ionut Florin Boris
 * @version v1.0 2022
 */

public enum ItemType
{
    KEY("key"), 

    SwimSuit("swimsuit"), 

    CovidPass("covidpass"), 

    Money("money"),
    
    MASK("mask");

    private String itemString;

    ItemType(String itemString)
    {
        this.itemString = itemString;
    }

    public String toString()
    {
        return itemString;
    }
}    

