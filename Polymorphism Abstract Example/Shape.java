public abstract class Shape
{
	public String toString()
	{
		return getDescription() + "\t" +  getArea();
	}
	
	public abstract double getArea();
	public abstract String getDescription();
}