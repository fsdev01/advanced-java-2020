/**
 * 
 */
package lab1;

/**
 * Circle is derived from Shape
 * @author user
 *
 */
public class Circle extends Shape{
	
	private double radius;
	
	// Constructor
	public Circle(int x, int y,double radius) {
		super(x,y); // (x,y) coordinate
		this.radius = radius;
		
		// Prevent object creation if the state is invalid
		// Radius must be >0
		if( radius <= 0 ) {
			throw new IllegalStateException("Radius must be > 0");
		}
	}
	
	// Override Method - Dynamic Polymorphism
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	// Override Method
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
}
