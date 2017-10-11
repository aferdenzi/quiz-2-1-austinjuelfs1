package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.Square;

public class SquareTest 
{
	private final double DELTA = 0.0000000000001;
	
	@Test
	public void testCalculateArea() 
	{
		Square sq1 = new Square(2);
		assertEquals(4, sq1.calculateArea(), DELTA);
		fail("Not yet implemented");
	}

	@Test
	public void testGetSide() 
	{
		Square sq1 = new Square(2);
		assertEquals(2, sq1.getSide(), DELTA);
		fail("Not yet implemented");
	}

}
