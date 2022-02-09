//Alphonso Martin
//Programming II

import java.text.NumberFormat;
public class PiggyBank
{
    NumberFormat money = NumberFormat.getCurrencyInstance(); 
    private double total;

    public PiggyBank()
    {
        total = 0.0;
    }

    public void addPenny()
    {
        total += 0.01;
    }

    public void addNickel()
    {
        total = 0.05 + total;
    }

    void addDime()
    {
        total = 0.10 + total;
    }

    void addQuarter()
    {
        total = 0.25 + total;
    }

    public String smashBank()
    {
        return "You have " + money.format(total); 
    }
}
