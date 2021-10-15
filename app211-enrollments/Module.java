
/**
 * Module 
 *
 * @author Ionut Boris
 * @version v1.0
 */
public class Module
{
    // instance variables - replace the example below with your own
    private String code;
    private String title;
    private int credit;
    

    /**
     * This is the constructor method that will set the parameters 
     * for the class module and it will sets up the initial values
     * of the variables.
     */
    public Module(String code, String title)
    {
        
        this.code = code;
        this.title = title;
        credit=0;
    
    
    }

    /** This method is returning the value of the code.
     * 
     */public String getCode ()
    {
        return code;
    
    }
    
        
    /** This medthod is for printing the details of the module
     * 
     */
    public void print ()
    {
      
    System.out.println( "Module code: " + code + ": " 
                        + title + "Credit: " + credit);
    System.out.println();
}

   
    /** Over this method i am returning the value for the title within.
     * 
     */public String getTitle()
    {
        // put your code here
        return title;
    
    }
    
    public void setCredit(int credit)
    {
        this.credit = credit;
    }
    
}
