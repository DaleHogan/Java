public class MyFactory
{
	public static Shape getShape()
	{
		double shape = 0;
		shape = Math.round(Math.random() * 2);
		shape = (int)shape;
			
		// Create Square shape
		if (shape == 0)
		{
			Square sq;
			int num = (int)(Math.random() * 20 + 1); 
			return sq = new Square(num);
		}
		// Create Circle shape
		else if (shape == 1)
		{
			Circle c;
			int num = (int)(Math.random() * 20 + 1); 
			return c = new Circle(num);
		}
		// Create Rectangle shape
		else 
		{
			Rectangle r;
			int num = (int)(Math.random() * 20 + 1); 
			int num1 = (int)(Math.random() * 20 + 1); 
			return r = new Rectangle(num, num1);
		}	
	}
}