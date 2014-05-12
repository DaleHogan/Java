class Ex1405
{
	public static void main(String[] args)
	{
		Square a = new Square(3);
		Circle b = new Circle(5);
		Rectangle c = new Rectangle(4, 7);
		System.out.println("\nDescription\t\tArea\n");
		System.out.println(a.getDescription() + "\t" + a.getArea());
		System.out.println(b.getDescription() + "\t" + b.getArea());
		System.out.println(c.getDescription() + "\t" + c.getArea());
	}
}
