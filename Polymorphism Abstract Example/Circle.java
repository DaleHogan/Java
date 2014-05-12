public class Circle extends Shape
{
	private int _radius;
	
	Circle(int radius)
	{
		_radius = radius;
	}
	
	public double getArea()
	{
		return Math.PI * (Math.pow(_radius, 2));
	}
	
	public String getDescription()
	{
		return "Circle, radius:  " + _radius;
	}

}