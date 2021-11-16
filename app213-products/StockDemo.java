
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * Modified by Ionut Boris
 * @version v1.0 - 11/2021
 */

public class StockDemo
{
    // The stock manager.
    private StockList stock;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockList stock)
    {
        this.stock = stock;
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(101, "Crysis 3"));
        stock.add(new Product(102, "Dota 2"));
        stock.add(new Product(103, "Counter Strike Global Offensive"));
        stock.add(new Product(104, "Rift"));
        stock.add(new Product(105, "Battlefield Bad Company 2"));
        stock.add(new Product(106, "Call of Duty: Modern Warfare 2"));
        
        
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    private void buyProducts()
    {
    }

    private void sellProducts()
    {
    }    
}