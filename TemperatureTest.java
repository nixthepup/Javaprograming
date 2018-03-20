public class TemperatureTest
{
	public static void main(String[] args)
	{
		Temperature temp = new Temperature(32);
		System.out.println("Fahrenheit: " + temp.getFahrenheit());
		System.out.println("Celsius: " + temp.getCelsius());
		System.out.println("Kelvin: " + temp.getKelvin());
	}
}