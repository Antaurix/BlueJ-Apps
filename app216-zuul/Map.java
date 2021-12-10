
/**
 * This class is reponsible for creating and
 * linking all the Locations in the game to
 * form a 2D or 3D network
 *
 *  [Pub]<---->[Outside]<---->[Theatre]
 *                 |
 *          [Computer Lab]<---->[Office]
 *             
 * @author Derek Peacock and Nicholas Day
 * @version 2021-08-22
 */
public class Map
{
    // Need to add a list of exits
    
    private Location house,street,car,shop,citycentre,park,museum,beach;

    private Location currentLocation;

    /**
     * Constructor for objects of class Map
     */
    public Map()
    {
        createLocations();
    }

    /**
     * Create all the Locations and link their exits together.
     * Set the current location to the outside.
     * Both locations need to have been created before
     * their exists are linked.
     */
    private void createLocations()
    {
        createStreet();
        createHouse();
        createCar();
        createShop();
        createCitycentre();
        createPark();
        createMuseum();
        createBeach();

        currentLocation = street;  // start game inside your house
    }
    /**
     * Create the street situated outside your house.
     */
    private void createStreet()
    {
        street = new Location("outside on the street");
    }
    
    /**
     * 
     */
    private void createHouse()
    {
        house = new Location("you are inside your house");
        house.setExit("east",street);
        street.setExit("west",house);
    }
    
    private void createShop()
    {
        shop = new Location("want to buy something ?"); 
        shop.setExit("west",street);
        street.setExit("east",shop);
    }
    
     private void createCar()
    {
        car = new Location("your inside your car");
        car.setExit("south",street);
        street.setExit("north",car);
    }
    
    /**
    * 
     */
    private void createCitycentre()
    {
        citycentre = new Location("you are in the middle of the city");
        street.setExit("south",citycentre);
        citycentre.setExit("north",street);
    }
   
    private void createPark()
    {
        park = new Location("in pure nature with fresh air");
        citycentre.setExit("east",park);
        park.setExit("west",citycentre);
    }
    private void createMuseum()
    {
        museum = new Location("a building with a lot of history");
        citycentre.setExit("east",museum);
        museum.setExit("west",citycentre);
    }
    private void createBeach()
    {
        beach = new Location(" you see a beautiful water and a blue sky");
        citycentre.setExit("south",beach);
        beach.setExit("north",citycentre);
    }
    
    public Location getCurrentLocation()
    {
        return currentLocation;
    }
    public void enterLocation(Location nextLocation)
    {
        currentLocation = nextLocation;
    }
}
