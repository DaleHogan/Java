public class Rectangle extends Square
{
	private int _height;
	
	Rectangle(int width, int height)
	{
		super(width);
		_height = height;
	}
	
	public double getArea()
	{
		return super.getWidth() * _height;
	}
	
	public String getDescription()
	{
		return "Rectangle, " + super.getWidth() + " by " + _height;
	}
}