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
        //it allocates space for your instance to live
        //Circle() which calls the CONSTRUCTOR in the CIRCLE class
        //in this case we call the default constructor
        
        
        System.out.println(pizza.getRadius());
        pizza.setRadius(8);
        System.out.println(pizza.getRadius());
        //System.out.println(pizza.radius); this will not work; private
        
        
        Circle token = new Circle(3);
        Circle pie = new Circle(10);
        Circle clock = new Circle(99);
        
        System.out.println("Token" + token.getRadius());
        System.out.println("Pie" + pie.getRadius());
        System.out.println("Clock" + clock.getRadius());
        
        token.setRadius(2);
        double x = 7.9;
        token.setRadius(x);
        token.setRadius(Math.random());
    }
}
