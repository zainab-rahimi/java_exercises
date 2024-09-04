package udemy_EazyBytes;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Rectengle ::draw() method");
	}

	@Override
	public void getSize(int height, int width) {
		// TODO Auto-generated method stub
		System.out.println(width * height);
		
	}

	@Override
	public String toString() {
		return "Rectangle [toString()=" + super.toString() + "]";
	}
	
}
