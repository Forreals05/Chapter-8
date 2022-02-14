//Alphonso Martin
//Programming II

public class DigitExtractor
{
    private int num;
    
    public DigitExtractor()
    {
        num = 0;
    }
    
    public void setNum(int n)
    {
        num = n;
    }
    public void Whole()
    {
        System.out.println("The whole number is: "+ num );
        System.out.println();
    }
    
    public int ones()
    {
        int ones = num % 10;
        return ones;
    }
    
    public int tens()
    {
        int tens = num % 100;
        tens = tens / 10;
        return tens;
    }
    
    public int hundo()
    {
        int hundo = num / 100;
        return hundo;
    }
    
    public String quits()
    {
        return "Goodbye!";
    }
}
