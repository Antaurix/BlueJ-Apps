
/**
 * Write a description of class ItemType here.
 *
 * @author (your name)
 * @version (a version number or a date)
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

