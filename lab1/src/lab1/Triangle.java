package lab1;

public class Triangle extends Shape {
	
	// Instance Variables
	private double a;
	private double b;
	private double c;
	
	
	
	/*
	 * Triangle() Constructor
	 * @inputs: (x,y) coordinates on 2D 
	 *          a,b,c - sides of a triangle
	 * 
	 */
	public Triangle (int x, int y,double a, double b, double c ) {
		super(x,y); // (x,y) position on 2D Cartesian
		this.a = a;
		this.b = b;
		this.c = c;
		
		if( a <= 0 || b <= 0 || c <= 0 ) {
			throw new IllegalStateException("All sides of the triangle must be > 0");
		}
	}
	
	// Heron's Formula
	public double getArea() {
		double s = (a+b+c) / 2.0;
		return Math.sqrt(s * (s-a) * (s-b) * (s-c));
	}
	
	// Override Method
	public double getPerimeter() {
		return a + b + c;
	}
}
