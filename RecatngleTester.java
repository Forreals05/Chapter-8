//Alphonso Martin
//Programming II

public class RectangleTester
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle();
        
        box.setLength(6);
        System.out.println("Box L= " + box.getLength());
        
        box.setWidth(3);
        System.out.println("Box W= " + box.getWidth());
        
        System.out.println("Box P= " + box.getPerimeter());
        System.out.println("Box A= " + box.getArea());
        
        Rectangle.displayPerimeterFormula();
        Rectangle.displayAreaFormula();
        
        Rectangle table = new Rectangle();
        
        table.setWidth(2);
        table.setLength(9);
        
        System.out.println(box.equals(table));
        
    
    }
}
