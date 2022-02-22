//Alphonso Mart
//Programming

import java.util.Scanner;
import java.text.NumberFormat;
public class LunchOrder
{
    Scanner input = new Scanner(System.in);
    NumberFormat money = NumberFormat.getCurrencyInstance();
    
    private double total;
    private int user;
    
    public LunchOrder()
    {
        total = 0;
    }
    
    public void hamburger()
    {
        System.out.println("Enter number of hamburgers: ");
        user = input.nextInt();
        System.out.println("Each hamburger has 9.0g of fat, 33.0g of carbs, and 1.0g of fiber");
        total = 1.85 * user;
    }
    public void salads()
    {
        System.out.println("Enter number of salads: ");
        user = input.nextInt();
        System.out.println("Each salad has 1.0g of fat, 11.0g of carbs, and 5.0 of fiber");
        total = total + (2.00 * user);
    }
    public void frenchFries()
    {
        System.out.println("Enter number of french fries: ");
        user = input.nextInt();
        System.out.println("Each french fry has 11.0g of fat, 36.0g of carbs, and 4.0g of fiber");
        total = total + (1.30 * user);
    }
    public void soda()
    {
        System.out.println("Enter number of sodas: ");
        user = input.nextInt();
        System.out.println("Each soda has 0.0g of fat, 38.0g of carbs, and 0.0g of fiber");
        total = total + (0.95 * user);
    }
    public String toString()
    {
        return "Your order comes to: " + money.format(total);
    }
}
