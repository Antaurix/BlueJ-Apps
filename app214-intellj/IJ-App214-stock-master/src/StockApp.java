
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Ionut Boris
 * @version v0.1 - October 2021
 */
public class StockApp
{
    private InputReader reader;
    
    private StockList stock;
    
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        reader = new InputReader();
        
        stock = new StockList();
        StockDemo demo = new StockDemo(stock);
    }

    /**
     *  Display a list of menu choices and execute
     *  the user's choice.
     */
    public void run()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = reader.getString("Please enter your choice > ");
            
            finished = executeChoice(choice.toLowerCase());
        }
    }
    
    private boolean executeChoice(String choice)
    {
        if(choice.equals("quit"))
        {
            return true;
        }
        else if (choice.equals("add"))
        {
            int id = reader.getInt(" Please enter your id: ");
            String name =reader.getString(" Please enter the name: ");
            Product product = new Product(id, name);
            stock.add(product);
            System.out.println("Product " + product.getID() + " " 
            + product.getName() + " has been added");
        }
        else if (choice.equals("remove"))
             
        {
        System.out.println(" Remove a product from the list ");
        System.out.println();
        int id = reader.getInt(" Please enter the product id to be removed: ");
        stock.deleteProduct(id);
    
        System.out.println(" The product " + id + " has been removed");
    
        }
             
        else if(choice.equals("print"))
        {
            
            stock.print();
        }
        
        return false;
    }
    
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Print:      Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("********************************");
        System.out.println("  App21-04: Stock Application ");
        System.out.println("      by Student Name");
        System.out.println("********************************");
    }
}