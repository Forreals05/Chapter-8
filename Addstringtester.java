//Name -
//Date -
//Class -
//Lab  -

public class AddStringsRunner
{
    public static void main ( String[] args )
    {
        AddStrings demo = new AddStrings("hello","world");
        demo.add();
        System.out.println(demo);

        demo.setStrings("jim","bob");
        demo.add();
      System.out.println(demo);
      
       demo.setStrings("computer","science");
        demo.add();
      System.out.println(demo);
      
       demo.setStrings("zig","zag");
        demo.add();
      System.out.println(demo);
      
       demo.setStrings("wibbly","wobbly");
        demo.add();
      System.out.println(demo);
      
       demo.setStrings("timey","whimey");
        demo.add();
      System.out.println(demo);

        //add more test cases        
    }
}
