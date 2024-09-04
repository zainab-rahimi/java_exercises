package udemy_EazyBytes;

public class ShapeFactory {
	// add a getShape method to get object of type shape
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		else if (shapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		else if (shapeType.equalsIgnoreCase("Squar")) {
			return new Squar();
		}
		return null;
	}
}
