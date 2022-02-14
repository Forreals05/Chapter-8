//Alphonso Martin
//Programming II

import  java.util.Scanner;

public class Digittester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        DigitExtractor digit = new DigitExtractor();
        
        int num2 = 0;
        char place = 'A';
        
        System.out.print("Enter a three-digit integer: ");
        num2 = input.nextInt();
        digit.setNum(num2);
        
        do
        {
            System.out.println("Show (W)hole number\n Show (O)nes place holder\n Show (T)ens place number\n Show (H)undreds place number\n (Q)uit");
            System.out.print("Enter your choice: ");
            place = input.next().charAt(0);
            
            if (place =='W' || place == 'w')
            {
                digit.Whole();
            }
            else if (place == 'O' || place == 'o')
            {
                System.out.println("The ones place number is: " + digit.ones());
                System.out.println();
            }
            else if (place == 'T' || place == 't')
            {
                System.out.println("The tens place holder is: " + digit.tens());
                System.out.println();
            }
            else if (place == 'H' || place == 'h')
            {
                System.out.println("The hundreds place number is: " + digit.hundo());
                System.out.println();
            }
        }
        while (place =='W'|| place == 'w'|| place == 'O' || place == 'o'|| place == 't'|| place =='T' || place == 'H'||place =='h');
        System.out.println(digit.quits());
    }
}
