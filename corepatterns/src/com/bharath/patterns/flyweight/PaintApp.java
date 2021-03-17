package com.bharath.patterns.flyweight;

public class PaintApp {
	
	public void render(int numberOfShapes) {
		
		Shape shape = null;
		for(int i = 0;i <= numberOfShapes;i++) {
			if(i%2 == 0) {
				shape = ShapeFactory.getShape("circle");
				shape.draw(i, "red", "blue");
			} else {
				shape = ShapeFactory.getShape("rectangle");
				shape.draw(i, i+i, "dotted");
			}
			
		}
		
//		Shape[] shapes = new Shape[numberOfShapes+1];
//		
//		for(int i = 0;i < numberOfShapes;i++) {
//			if( i%2 == 0) {
//				shapes[i] = new Circle();
//				((Circle)shapes[i]).setRadius(i);
//				((Circle)shapes[i]).setLineColor("red");
//				((Circle)shapes[i]).setFillColer("blue");
//				shapes[i].draw();
//			} else {
//				shapes[i] = new Rectangle();
//				((Rectangle)shapes[i]).setLength(i);
//				((Rectangle)shapes[i]).setBreadth(i + i);
//				((Rectangle)shapes[i]).setFillStyle("dotted");
//				shapes[i].draw();
//			}
//			
//		}
//		
	}

}
