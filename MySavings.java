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

        System.out.println("1. Show total in bank.\n2. Add a penny.\n3. Add a nickel.\n4. Add a dime.\n5.Add a quarter.\n6. Take money out of bank.\nEnter 0 to quit.");

        do
        {
            System.out.print("Your choice: ");
            pick = input.nextInt();

            if (pick == 1)
            {
                System.out.println(glenda.smashBank());
            }
            else if(pick == 2)
            {
                glenda.addPenny();
            }
        }
        while(pick != 0);
    }
}
