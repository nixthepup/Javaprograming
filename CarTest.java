public class CarTest
{
	public static void main(String[] args)
	{
		Car car1 = new Car("Ford", 2014);
		for(int i = 1; i <=5; i++)
		{
			car1.accelerate();
			System.out.println(car1.getSpeed());
		}
		
		for(int j = 1; j <= 5; j++)
		{
			car1.brake();
			System.out.println(car1.getSpeed());
		}
		
	}
}
