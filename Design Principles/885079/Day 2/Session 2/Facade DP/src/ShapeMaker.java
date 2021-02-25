
public class ShapeMaker {

	private Circle circle;
	private Square square;
	private Rectangle rectangle;
	
	public ShapeMaker() {
		circle=new Circle();
		square=new Square();
		rectangle=new Rectangle();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawSquare() {
		square.draw();
	}
	
	public void drawRectangle() {
		rectangle.draw();
	}
}

