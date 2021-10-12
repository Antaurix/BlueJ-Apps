
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
     * Setting the variables of the module
     */
    public Module(String code, String title)
    {
        
        this.code = code;
        this.title = title;
        credit=0;
    
    
    }

    /** Set the value of the code
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

   
    /** Set the value for the title 
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
