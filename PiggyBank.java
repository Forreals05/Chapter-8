//Alphonso Martin
//Programming II

public class PiggyBank
{
     private double total;
     
     public PiggyBank()
     {
         total = 0;
     }
     public PiggyBank(double t)
     {
         total = t;
     }
     
     public String toString()
     {
        return "1. Show total in bank.\n2. Add a penny.\n3. Add a nickel.\n4. Add a dime.\n5.Add a quarter.\n6. Take money out of bank.\nEnter 0 to quit.";
     }
     
     void addPenny()
     {
         total = 0.01 + total;
         
     }
     void addNickel()
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
     void smashBank()
     {
         total = total - total;
     }
}
