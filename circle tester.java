//Alphonso Martin
//Programming II

public class CircleTester
{
    public static void main(String[] args)
    {
        Circle pizza = new Circle();
        //Circle tells java to go to the Circle class
        //and make a Circle objest using that file
        // pizza is the INDENTIFIER of your new CIRCLE object
        //that is the variable name
        //new is a keyword that INSTANTIATES the object
        //this createx the new CIRCLE object on your RAM
        //it allocates space for your instance to live on
        //Circle() which calls the CONSTRUCTOR in the CIRCLE class
        //in this case we call the default constructor
        //Circle() - this is our constructor, used to INTIALIZE our
        //instance variable
        
        System.out.println(pizza.getRadius());
        pizza.setRadius(6);
        System.out.println(pizza.getRadius());
        //System.out.println(pizza.radius); this will not work; private
        
        
        Circle token = new Circle(.5);
        Circle pie = new Circle(10);
        Circle clock = new Circle(99);
        
        System.out.println("Token" + token.getRadius());
        System.out.println("Pie" + pie.getRadius());
        System.out.println("Clock" + clock.getRadius());
        System.out.println();
        System.out.println("Token A=" + token.getArea());
        System.out.println("Pizza A=" + pizza.getArea());
        
        
        
        pizza.displayAreaFormula();
        Circle.displayAreaFormula(); // because this is a static method it can be called from
        // the class itself instead of from a specific insatnce of the class
        
        System.out.println();
        System.out.println(pie);
        token.setRadius(2);
        double x = 7.9;
        token.setRadius(x);
        token.setRadius(Math.random());
       
       System.out.println(token.toString());
       
       
       pie.setRadius(42);
       pizza.setRadius(42);
       
       System.out.println(pizza == pie);
       System.out.println(pizza.equals(pie));
       
    }
}
