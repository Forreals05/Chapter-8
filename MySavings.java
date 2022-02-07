//Alphonso Martin
//Programming II

import java.util.Scanner;

public class MySavings
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int pick = -1;
    
        PiggyBank glenda = new PiggyBank();
    
        System.out.println(glenda.toString());
        
        System.out.print("Your choice: ");
        pick = input.nextInt();
    
        if (pick == 1)
        {
            System.out.println("You have "  + " in your bank");
        }
    }
}
