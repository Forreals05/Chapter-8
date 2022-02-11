// Alphonso Martin
/*
 * 9/7/21
 * Programming II
 * Banner Digits
 */

import java.util.Scanner;
public class BannerDigits
{
    public static void main(String[] args)
    {
        Scanner input =  new Scanner(System.in);
        
        int numInput = 0;
        
        
        System.out.print("Enter a three-digit number: ");
        numInput = input.nextInt();
        
        int num1 = numInput / 100;
        int num2 = numInput % 100;
        num2 = num2 / 10;
        int num3 = numInput % 100;
        
        System.out.println("|---|");
        System.out.println("| " + num1 + " |");
        System.out.println("| " + num2 + " |");
        System.out.println("| " + num3 + " |");
        System.out.println("|---|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
    }
}
