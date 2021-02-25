package com.dp.main;

import com.dp.concrete.ShapeMaker;

public class Main {

	public static void main(String[] args) {

		ShapeMaker sm = new ShapeMaker();
		sm.drawCircle();
		sm.drawRectangle();
		sm.drawSquare();
	}

}
