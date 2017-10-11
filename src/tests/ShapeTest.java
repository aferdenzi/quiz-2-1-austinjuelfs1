package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.Circle;

public class ShapeTest {

	/*
	 * Write a test for Shape's compareTo method.
	 * 
	 * Also create SquareTest.java and CircleTest.java JUnit test cases.
	 * Test each class's constructor method and calculateArea method.
	 */
	private final double DELTA = 0.0000000000001;
	
	@Test
	public void testCompareTo() 
	{
		Circle a = new Circle(1);
		Circle b = new Circle(1);
		assertEquals(0, a.compareTo(b), DELTA);
		fail("Not yet implemented");
		
		
		Circle c = new Circle(100);
		Circle d = new Circle(1);
		assertEquals(1, c.compareTo(d), DELTA);
		fail("Not yet implemented");
		
	}
	
	

}
