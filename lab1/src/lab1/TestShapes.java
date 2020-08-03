package lab1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestShapes {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	/*
	 * Test Case: Create Rectangle with invalid width
	 * Input: width = -10, height = 5;
	 * 
	 */
	@Test
	void testRectangle0001(){
		assertThrows(IllegalStateException.class, () -> {
		      Rectangle r1 = new Rectangle(0,0,-10,5);
		    });
	}
	
	/*
	 * Test Case: Create Rectangle with invalid height
	 * Input: width = 10, height = -5;
	 * 
	 */
	@Test
	void testRectangle0002(){
		assertThrows(IllegalStateException.class, () -> {
		      Rectangle r1 = new Rectangle(0,0,10,-5);
		    });
	}
	
	/*
	 * Test Case: Create Rectangle with invalid width and height
	 * Input: width = -10, height = -5;
	 * 
	 */
	@Test
	void testRectangle0003(){
		assertThrows(IllegalStateException.class, () -> {
		      Rectangle r1 = new Rectangle(0,0,-10,-5);
		    });
	}
	
	/* 
	 * Test Case: Rectangle's getArea() with valid inputs
	 * Inputs: width = 10 , height = 2
	 */
	@Test
	void testRectangleArea001() {
		
		Rectangle r1 = new Rectangle(0,0,10,2);
		double expected = 20;
		double actual = r1.getArea();
		assertEquals(expected,actual);
		
	}
	
	/*
	 * Test Case: Rectangle's getPerimeter() with valid inputs
	 * Inputs: width = 10, height =2
	 */
	@Test
	void testRectanglePeri0001() {
		
		Rectangle r1 = new Rectangle(0,0,10,2);
		double expected = 24;
		double actual = r1.getPerimeter();
		assertEquals(expected,actual);
		
	}
	
	/*
	 * Test Case: Circle's getArea() with valid inputs
	 * Inputs: radius = 5
	 */
	@Test
	void testCircleArea0001() {

		Circle c1 = new Circle(0,0,5);
		double expected = 5 * 5 *  Math.PI;
		double actual = c1.getArea();
		assertEquals(expected,actual);
		
	}
	
	/*
	 * Test Case: Circle's getPerimeter() with valid inputs
	 * Inputs: radius = 5
	 */
	@Test
	void testCirclePeri0001() {
		
		Circle c1 = new Circle(0,0,5);
		double expected = 2 * Math.PI * 5;
		double actual = c1.getPerimeter();
		assertEquals(expected,actual);
		
	}
	
	/*
	 * Test Case: Create circle with invalid radius
	 * Input: 0
	 * 
	 */
	@Test
	void testCircle0001(){
		Throwable exception = assertThrows(IllegalStateException.class, () -> {
		      Circle c1 = new Circle(0,0,0);
		    });
		assertEquals(exception.getMessage(), "Radius must be > 0");
	
	}
	
	
	/*
	 * Test Case: Create circle with invalid radius
	 * Input: -1
	 * 
	 */
	@Test
	void testCircle0002(){
		Throwable exception = assertThrows(IllegalStateException.class, () -> {
		      Circle c1 = new Circle(0,0,-1);
		    });
		assertEquals(exception.getMessage(), "Radius must be > 0");
	
	}
	

	/*
	 * Test Case: Create Triangle with one invalid side
	 * Input: a = -4, b = 5, c = 6
	 * 
	 */
	@Test
	void testTriangle001(){
		assertThrows(IllegalStateException.class, () -> {
		      Triangle t1 = new Triangle(0,0,-4,5,6);
		    });
	}
	
	/*
	 * Test Case: Create Triangle with one invalid side
	 * Input: a = 4, b = -5, c = 6
	 * 
	 */
	@Test
	void testTriangle002(){
		assertThrows(IllegalStateException.class, () -> {
		      Triangle t1 = new Triangle(0,0,4,-5,6);
		    });
	}

	/*
	 * Test Case: Create Triangle with one invalid side
	 * Input: a = 4, b = 5, c = -6
	 * 
	 */
	@Test
	void testTriangle003(){
		assertThrows(IllegalStateException.class, () -> {
		      Triangle t1 = new Triangle(0,0,4,5,-6);
		    });
	}
	

	/*
	 * Test Case: Create Triangle with three invalid sides
	 * Input: a = -4, b = -5, c = -6
	 * 
	 */
	@Test
	void testTriangle004(){
		assertThrows(IllegalStateException.class, () -> {
		      Triangle t1 = new Triangle(0,0,-4,-5,-6);
		    });
	}
	
	
	/*
	 * Test Case: Triangle's getArea() with valid inputs
	 * Heron's Formula
	 * Inputs: a = 3, b = 4, c= 5
	 */
	@Test
	void testTriangleArea0001() {

		Triangle t1 = new Triangle(0,0,3,4,5);
		double expected = 6;
		double actual = t1.getArea();
		assertEquals(expected,actual);
		
	}
	
	/*
	 * Test Case: Triangle's getPerimeter() with valid inputs
	 * Inputs: a = 3, b = 4, c = 5
	 */
	@Test
	void testTrianglePeri0001() {
		
		Triangle t1 = new Triangle(0,0,3,4,5);
		double expected = 12;
		double actual = t1.getPerimeter();
		assertEquals(expected,actual);
		
	}
	
	
	
	
	


}
