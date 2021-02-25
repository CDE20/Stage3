package facade;

import shapemaker.ShapeMaker;

public class FacadePatternDemo {
	public static void main(String...k)
	{
		ShapeMaker shapeMaker=new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}
