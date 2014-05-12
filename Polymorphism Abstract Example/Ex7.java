public class Ex7
{
	public static void main (String [] args)
	{
		Shape [] shapes = new Shape[10];
		for (int i = 0; i < shapes.length; i++)
		{
			shapes[i] = MyFactory.getShape();
			System.out.println(shapes[i]);
		}
	}
}