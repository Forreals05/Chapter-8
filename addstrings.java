//Name -
//Date -
//Class -
//Lab  -

public class AddStrings
{
   private String first, last;
   private String sum;

   public AddStrings()
   {
       setStrings("", "");
   }

   public AddStrings(String one, String two)
   {
      setStrings(one, two);
   }

   public void setStrings(String one, String two)
   {
       first = one;
       last = two;
   }

     public void add( )
     {
         sum = first + " " + last;
    }

     public String toString()
     {
         String output="";
         output += "First: " + first + "\n";
         output += "Last: " + last + "\n";
         output += "sum: " + sum + "\n";
         return output;
    }
}
