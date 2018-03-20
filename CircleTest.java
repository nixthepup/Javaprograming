public class CircleTest
{
	public static void main(String[] args)
	{
		Circle circle = new Circle(4);
		
		System.out.println("Radius: " + circle.getRadius());
		System.out.println("Area: " + circle.getArea());
		System.out.println("Diameter: " + circle.getDiameter());
		System.out.println("Circumference: " + circle.getCircumference());
	}
}