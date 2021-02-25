package com.dp.concrete;

import com.dp.Shape;
import com.dp.model.Circle;
import com.dp.model.Rectangle;
import com.dp.model.Square;

public class ShapeMaker {

	private Shape circle;
	private Shape rectangle;
	private Shape square;
	
	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawRectangle() {
		rectangle.draw();
	}
	
	public void drawSquare() {
		square.draw();
	}
}
