/**
 * 
 */
package lab1;

/**
 * @author 102125413
 * Abstract Class cannot be instantiated but subclass/inherited/extended
 * It may contain instance variables
 * Abstract methods must be overriden by derived class
 */
public abstract class Shape {
	
	// X and Y positions of the Shape
	private int x; 
	private int y;
	
	// Constructor
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	// Getter Methods
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	
	// Abstract Methods - Method Headers
	public abstract double getArea();
	public abstract double getPerimeter();
	
	

}
