// Alphonso Martin
//Programing II

public class Rectangle
{
    private double length;
    private double width;
    
    public Rectangle()
    {
        length = 1;
        width = 1;
    }
    
    public Rectangle(double l, double w)
    {
        length = l;
        width = w;
    }
    
    public double getLength()
    {
        return length;
    }
    public double getWidth()
    {
        return width;
    }
    
    public void setLength(double l)
    {
        length = l;
    }
    public void setWidth(double w)
    {
        width = w;
    }
    
    public double getPerimeter()
    {
        return (2 * (length * width));
    }
    public double getArea()
    {
        return (length * width);
    }
    
    public static void displayPerimeterFormula()
    {
        System.out.println("Perimeter = 2 * (length * width)");
    }
    public static void displayAreaFormula()
    {
        System.out.println("Area = length * width");
    }
}
