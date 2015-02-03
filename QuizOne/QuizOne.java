
/**
 * This code recieves a customer name, age and the cost
 * of merchandise. It also calculates the total cost of 
 * the purchase depending on the tax rate. It will also 
 * print a reciept for the sale. 
 * 
 * @Lauren Graham 
 * @version 1.0
 */
public class QuizOne
{
    private int age;
    private double bookCost;
    private double tax;
    private double totalCost;
    private double totalTax;
    private String last;

    /**
     * Initializes all variables. 
     */
    public QuizOne()
    {
      age = 0;
      bookCost = 0;
      tax = 0;
      totalTax = 0;
      totalCost = 0;
    }
    
    /**
     * Allows the buyer to input
     * their age. 
     */
    public void setAge(int newAge)
    {
      age = newAge;
    }
    /**
     *Allows the user to see
     *the entered age. 
     */
    public int getAge()
    {
     return age;
    }
    
    /**
     * Allows the buyer to input the cost.
     */
    public void setBookCost(double bookPrice)
    {
     bookCost = bookPrice;
    }
    
    /**
     *Shows the entered cost.
     */
    public double getBookCost()
    {
      return bookCost;
    }
    
    /**
     * Allows the buyer to set the tax
     * amount.
     */
    public void setTaxAmount(int taxAmount)
    {
     tax = taxAmount;
    }
    
    /**
     * Shows the entered tax.
     */
    public double getTaxAmount()
    {
     return tax;
    }
    
    /**
     * Allows the buyer to enter their last
     * name.
     */
    public void setLastName(String lastName)
    {
     last = lastName;
    }
    
    /**
     * Shows the entered
     * last name.
     */
    public String getLastName()
    {
     return last;
    }
    
    /**
     * Calculates the final cost.
     */
    public void calculateCost()
    {
     totalTax = bookCost*tax;
     totalCost = bookCost + totalTax;
    }
    
    /**
     * Prints out a reciept.
     */
    public void printReciept()
    {
     System.out.println("Last Name: " + last);
     System.out.println("Buyer Age: " + age);
     System.out.println("Book Cost: " + bookCost);
     System.out.println("Total Tax: " + totalTax);
     System.out.println("Total Price: " + totalCost);
    }
}
