package shapemaker;

import interfaces.Circle;
import interfaces.Rectangle;
import interfaces.Shape;
import interfaces.Square;

public class ShapeMaker {
	private Shape circle;
	private Shape rectangle;
	private Shape square;
	
	public ShapeMaker() {}
	
	public void drawCircle()
	{
		circle=new Circle();
		circle.draw();
	}
	
	public void drawRectangle()
	{
		rectangle=new Rectangle();
		rectangle.draw();
	}
	
	public void drawSquare()
	{
		square=new Square();
		square.draw();
	}
	
}
