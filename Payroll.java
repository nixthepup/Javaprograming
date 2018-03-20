
 public class Payroll
 {
	private String name;
	private int idNum;
	private double hourlyPay;
	private double hoursWorked;
	
	
	public Payroll()
	{
		name = "";
		idNum = 0;
		hourlyPay = 0;
		hoursWorked = 0;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setIdNum(int id)
	{
		idNum = id;
	}
	
	public void setHourlyPay(double hp)
	{
		hourlyPay = hp;
	}
	
	public void setHoursWorked(double hw)
	{
		hoursWorked = hw;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getIdNum()
	{
		return idNum;
	}
	
	public double getHourlyPay()
	{
		return hourlyPay;
	}
	public double getHoursWorked()
	{
		return hoursWorked;
	}
	
	public double pay()
	{
		return hoursWorked * hourlyPay;
	}
 }