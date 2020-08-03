/**
 * 
 */
package lab1;

/**
 * Rectangle is a Shape.
 * 
 * @author user
 *
 */
public class Rectangle extends Shape {
	
	private double width;
	private double height;
	
	
	public Rectangle(int x, int y, double width, double height) {
		super(x,y); // (x,y) coordinate of shape
		this.width = width;
		this.height = height;
		
		// Precondition: width >0 and height > 0
		if( width <= 0 || height <= 0) {
			throw new IllegalStateException("Width and Height must be both > 0");
		}
		
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return 2 * (width + height);
	}
	

}
