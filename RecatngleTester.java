//Alphonso Martin
//Programming II

public class RectangleTester
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle();
        
        box.setLength(5);
        System.out.println("Box L= " + box.getLength());
        
        box.setWidth(3);
        System.out.println("Box W= " + box.getWidth());
        
        System.out.println("Box P= " + box.getPerimeter());
        System.out.println("Box A= " + box.getArea());
        
        Rectangle.displayPerimeterFormula();
        Rectangle.displayAreaFormula();
    }
}
