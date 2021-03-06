import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author Ionut Boris 
 * @version v.10 - 11/2021
 */
public class StockList
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockList()
    {
        stock = new ArrayList<Product>();
    }

    /**
     * Add a product to the list.
     * @param item The product item to be added.
     */
    public void add(Product item)
    {
        stock.add(item);
    }
    
    /**
     * A method to buy a single quantity of the product
     */
    public void buyProduct(int productID)
    {
        buyProduct(productID, 1);
    }
    
    
    /**
     * Buy a quantity of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void buyProduct(int productID, int amount)
    {
        Product product = findProduct(productID);
        if (product != null)
        {
             if(product.getQuantity() < 999)
            {
                product.increaseQuantity(amount);
                System.out.println(" We bought " + amount + "  " +
                product.getName());
               
            }
            else
            {
                System.out.println(" We don't got enough space for  " + 
                product.getName());
                
              
            }
        }
        else
        {
            System.out.println(" We couldn't find the product ");
            
        }
    }
    
    /**
     * Find a product to match the product id,
     * if not found return null
     */
    public Product findProduct(int productID)
    { 
        for(Product product : stock)
        {
            if(product.getID() == productID)
            return product;
        }
        return null;
    }
    
    
    /**
     * Sell more quantity of the given product.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int productID, int amount)
    {
        Product product = findProduct(productID);
        
        if(product != null) 
        {
            if(product.getQuantity() > 0 && product.getQuantity() > amount)
            {
                product.decreaseQuantity(amount);
                System.out.println(" We sold " + amount + "  " +
                product.getName());
               
            }
            else if(product.getQuantity()  == 0)
            {
                System.out.println(" The product is out of stock " + 
                product.getName());
                
              
            }
            else
            {
                System.out.println(" Can't sell " + amount + " of " +
                product.getName() + " because we only have " 
                +product.getQuantity() );
            }
        }
        else
        {
            System.out.println(" We couldn't find the product ");
            
        }
    }  
    
    /**
     * Sell one of the given product.
     * 
     */
    public void sellProduct(int productID)
    {
        sellProduct(productID, 1);
    }
    
    /**
     * This method is made with the purpose to find an item who contains
     * a specific phrase.
     * The method will print out the product id and the quantity and also
     * it will count how many results we found.
     * If the result is 0 it means we didn't find any product with the 
     * phrase.
     */
    public void search(String phrase)
    {
        int count = 0; 
        for(Product product:stock)
        {
            if(product.getName().contains(phrase))
            {
                System.out.println(product);
                count += 1;
            }
        }
        System.out.println(count+" products found");        
    }

    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    
    public int numberInStock(int productID)
    {
        return 0;
    }

    /**
     * Print details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printProduct(int productID)
    {
        Product product = findProduct(productID);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void print()
    {
        printHeading();
        
        for(Product product : stock)
        {
            System.out.println(product);
        }

        System.out.println();
    }
    
    public void printHeading()
    {
        System.out.println();
        System.out.println(" Boris's Stock List");
        System.out.println(" ====================");
        System.out.println();
    }
   
    /**
     * With this method we are going to remove an product from the 
     * stock using it's ID.
     */
    public void deleteProduct(int productID)
    {
        Product product = findProduct(productID);
        
        if(product != null) 
        {
                stock.remove(product);
                System.out.println(" The product " + product + " has been removed");
        }
}

/**
 * This method will display all product whose stock levels are below 
 * a value that we are going to set.
 **/
    public void levels(int value)
    {
        for(Product product:stock)
        {
            if(product.quantity < value)
            {
                System.out.println(" This stock " + product + " < " + value);
            }
        }
    }
}