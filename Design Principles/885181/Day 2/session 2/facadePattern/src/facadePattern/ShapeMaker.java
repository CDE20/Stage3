package facadePattern;

public class ShapeMaker {
   private Circle circle;
   private Rectangle rectangle;
   private Square square;
   public   ShapeMaker()
   {
	   
   }
   
   public void drawCircle()
   {
	   circle=new Circle();
	   circle.draw();
   }
   public void drawRectangle()
   {
	   rectangle = new Rectangle();   
	   rectangle.draw();
   }
   public void drawSquare()
   {
	   square=new Square();
	   square.draw();
   }
	
}
