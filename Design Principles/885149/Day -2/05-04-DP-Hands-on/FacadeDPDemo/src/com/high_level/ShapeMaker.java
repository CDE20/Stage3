package com.high_level;

import com.low_level.Circle;
import com.low_level.Rectangle;
import com.low_level.Shape;
import com.low_level.Square;

public class ShapeMaker {
	
	private Shape circle;
	private Shape rect;
	private Shape square;
	
	public ShapeMaker() {
		circle=new Circle();
		rect = new Rectangle();
		square = new Square();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawRectangle() {
		rect.draw();
	}
	
	public void drawSqaure() {
		square.draw();
	}
}
