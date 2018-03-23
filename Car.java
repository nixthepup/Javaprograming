public class Car
{
	private int yearModel;
	private String make;
	private int speed;
	
	public Car(String m, int ym)
	{
		yearModel = ym;
		make = m;
		speed = 0;
	}
	
	
	public void setYearModel(int ym)
	{
		yearModel = ym;
	}
	
	public void setMake(String m)
	{
		make = m;
	}
	
	public void setSpeed(int s)
	{
		speed = s;
	}
		
	public int getYearModel()
	{
		return yearModel;
	}
	
	public String getMake()
	{
		return make;
	}
	
	public int getSpeed()	
	{
		return speed;
	}
																						
	public void accelerate()
	{
		speed += 5; 
	}
	
	public void brake()
	{
		speed -= 5;
	}
}