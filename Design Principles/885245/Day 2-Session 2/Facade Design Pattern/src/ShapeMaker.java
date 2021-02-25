public class ShapeMaker
{
  private Circle circle;
  private Rectangle rectangle;
  private Square square;
  
  public ShapeMaker()
  {
	  circle=new Circle();
	  rectangle=new Rectangle();
	  square=new Square();
  }
  public void drawCircle()
  {
	  circle.draw();
  }
  public void drawRectangle() 
  {
	 rectangle.draw();
  }
  public void drawSquare()
  {
	 square.draw();
  }
}
