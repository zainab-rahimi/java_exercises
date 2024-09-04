package test;

import udemy_EazyBytes.Shape;
import udemy_EazyBytes.ShapeFactory;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape1 = shapeFactory.getShape("Circle");
		
		Shape shape2 = shapeFactory.getShape("Rectangle");
		
		Shape shape3 = shapeFactory.getShape("Squar");
		
		shape1.draw();
		
		
		shape2.draw();
		shape2.getSize(3, 3);
		
	}

}
