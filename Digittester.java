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
        
        System.out.println("Enter a three-digit integer: :");
        num2 = input.nextInt();
        digit.setNum(num2);
        
        do 
        {
            System.out.println("Show (W)hole number\n Show (O)nes place holder\n Show (T)ens place numbe\n Show (H)undreds place number\n (Q)uit");
            
        }
    }
}
