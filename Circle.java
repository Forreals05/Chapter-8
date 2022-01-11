// Alphonsoi Martin
//Programing II

public class Circle //this is a class header
//public is our ACCESS LEVEL
//public can be used by other classes
// the class keyword tells java that file will make a class
//class files are used to make OBJECTS
//circle is the INDENTIFIER for this circle
//we are essentially creating a new abstarct data type for java to use
//classes are always UPPERCASE because they are big and important
{
    //there will be a main method in here!
    //we are designing this to be used by other classes
    
    // classes are made up of variables, constructors, and method
    
    
    private double radius;
    //private means that radius can only be accessed by this file
    //this is a form of DATA ENCAPSULATION
    //radius is an INSTANCE VARIABLE
    //instance variables are unique to each instance of a given object
    
    private static final double PI = 3.141592653;
    //final makes this a CONSTANT VARIABLE
    //we name constants in all uppercase letters
    //the static keyword makes this a CLASS VARIABLE
    //class variables are shared between all instances of a given object
    //NOTE: static variables to not have to be final
    
    //the purpose of a constructor is to initialize instance variable
    //this is a DEFAULT constructor
    //beacuse it does not take an argument
    public Circle() // this is a CONSTRUCTOR header
    {
        radius = 1;
    }
    
    //this constructor takes an argument and stores it
    public Circle(double r)
    {
        radius = r;
    }
    //OVERLOADING is the strategy of two things with the same name
    // but different data types/amounts of arguments
    //with Mr.T constructors are NOT methods
    //constructors have the same name as the class
    //constructors have no return types
    
}
