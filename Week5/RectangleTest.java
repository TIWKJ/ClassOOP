public class RectangleTest {
    public static void main( String args[] ) {
      Rectangle Rectangle1 = new Rectangle(1,1);
      System.out.printf("Rectangle1 :: width = %d height = %d\n",Rectangle1.getWidth(),Rectangle1.getHeight());
      System.out.printf( "area: %d\n", Rectangle1.area() );
      System.out.printf( "perimeter: %d\n", Rectangle1.perimeter() );
      
      
      Rectangle Rectangle2 = new Rectangle(2,3); 
      System.out.printf("Rectangle2 :: width = %d height = %d\n",Rectangle2.getWidth(),Rectangle2.getHeight());
      System.out.printf( "area: %d\n", Rectangle2.area() );
      System.out.printf( "perimeter: %d\n", Rectangle2.perimeter() );


      Rectangle Rectangle3 = new Rectangle(10,10); 
      System.out.printf("Rectangle3 :: width = %d height = %d\n",Rectangle3.getWidth(),Rectangle3.getHeight());
      System.out.printf( "area: %d\n", Rectangle3.area() );
      System.out.printf( "perimeter: %d\n", Rectangle3.perimeter() );
       
   } 
}
