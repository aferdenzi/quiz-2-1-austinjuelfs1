package shapes;

public class Square extends Shape
{
	private double side;

	/*
	 * Complete the implementation of this class by finishing the constructor
	 * below.  Squares must have a positive side length.
	 */
	public Square(double side) throws IllegalArgumentException
	{
		if(side>0)
		{
			this.side = side;
		}
		else throw new IllegalArgumentException("The side must be greater than 0.");
	}
	
	/*
	 * Implement any remaining methods demanded by the superclass.
	 */

	public double getSide() {
		return side;
	}

	public double calculateArea() 
	{
		double area;
		area = side*side;
		return area;
	}
}
