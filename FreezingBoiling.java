public class FreezingBoiling
{
	private double temp;
	private boolean tf;
	
	public FreezingBoiling()
	{
		temp = 0;
		tf = false;
	}
	
	public void setTemp(double t)
	{
		temp = t;
	}
	
	public boolean isEthylFreezing()
	{
		if(temp <= -173)
		{
			tf = true;
		}
		return tf;
	}
	
	public boolean isOxygenFreezing()
	{
		if(temp >= -362)
		{
			tf = true;
		}
		return tf;
	}
	
	public boolean isWaterFreezing()
	{
		if(temp <= -32)
		{
			tf = true;
		}
		return tf;
	}
	
	public boolean isOxygenBoiling()
	{
		if(temp <= (-306))
		{
			tf = true;
		}
		return tf;
	}
	
	public boolean isWaterBoiling()
	{
		if(temp >= 212)
		{
			tf = true;
		}
		return tf;
	}
	
	public boolean isEthylBoiling()
	{
		if(temp >= 172)
		{
			tf = true;
		}
		return tf;
	}
}