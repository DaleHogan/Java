public class Square extends Shape
{
	private int _width;
	
	Square(int width)
	{
		_width = width;
	}
	
	public double getArea()
	{
		return Math.pow(_width, 2);
	}
	
	public int getWidth()
	{
		return _width;
	}
	
	public String getDescription()
	{
		return "Square, width: " + _width;
	}
}