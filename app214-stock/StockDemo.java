import java.util.Random;
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
    
    private Random generator = new Random();

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockList stock)
    {
        this.stock =  stock;
        stock.add(new Product(101, "Crysis 3"));
        stock.add(new Product(102, "Dota 2"));
        stock.add(new Product(103, "Counter Strike Global Offensive"));
        stock.add(new Product(104, "Rift"));
        stock.add(new Product(105, "Battlefield Bad Company 2"));
        stock.add(new Product(106, "Call of Duty: Modern Warfare 2"));
        stock.add(new Product(107, "World of Warcraft "));
        stock.add(new Product(108, "Need for Speed "));
        stock.add(new Product(109, "Grand theft Auto 5 " ));
        stock.add(new Product(110, "Starcraft 2 "));
    
        
        
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
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    /**
     * We are setting the value of how many products we need to buy for our
     * company
     * 
     */
    private void buyProducts()
    {
        Product product;
        int quantity = 1;
        
        for(int id = 100; id<=110; id++)
        {
            product = stock.findProduct(id);
            if(product == null)
             {
                 System.out.println(" The Product " + id + " cannot be found"
                 );
        
             }
             else
             {
                 quantity = generator.nextInt(37);
                 stock.buyProduct(id, quantity);
             }
        }
        
        /*stock.buyProduct(101, 777);
        stock.buyProduct(102, 270);
        stock.buyProduct(103, 300);
        stock.buyProduct(104, 150);
        stock.buyProduct(105, 70);
        stock.buyProduct(106, 99);
        stock.buyProduct(107, 670);
        stock.buyProduct(108, 260);
        stock.buyProduct(109, 888);
        stock.buyProduct(110, 444);
        */
    }
        
    /** 
     * Same as the method above(buy products) but for selling the items.
     */
    private void sellProducts()
    {
        Product product;
        int quantity = 1;
        
        for(int id = 100; id<=110; id++)
        {
            product = stock.findProduct(id);
            if(product == null)
             {
                 System.out.println(" The Product " + id + " cannot be found"
                 );
        
             }
             else
             {
                 quantity = generator.nextInt(37);
                 stock.sellProduct(id, quantity);
             }
        }
        
        
        /*stock.sellProduct(101,200);
        stock.sellProduct(102,150);
        stock.sellProduct(103,100);
        stock.sellProduct(104,20);
        stock.sellProduct(105,350);
        stock.sellProduct(106,34);
        stock.sellProduct(107,60);
        stock.sellProduct(108,450);
        stock.sellProduct(109,577);
        stock.sellProduct(110,12);
        */
    }    
}