public class Temperature
{
	private double ftemp;
	
	
	public Temperature(double f)
	{
		ftemp = f;
	}
	
	public double getFahrenheit()
	{
		return ftemp;
	}
	
	public double getCelsius()
	{
		return (5/9) * (ftemp);
	}
	
	public double getKelvin()
	{
		return ((5/9) * (ftemp -32)) + 273;
	}
}