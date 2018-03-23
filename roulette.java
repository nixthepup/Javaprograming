public class roulette
{
	private int pocket;
	private String color;
	
	public void setPocket(int p)
	{
		pocket = p;
	}
	
	public int getPocket()
	{
		return pocket;
	}
	
	public String getColor()
	{
		if(pocket == 0)
		{
			color = "Green";
		}
		
		if(pocket >=1 && pocket <= 10)
		{
			if(pocket % 2 == 0)
			{
				color = "black";
			}
			
			else
			{
				color = "red";
			}
		}
		
		if(pocket >=11 && pocket <= 18)
		{
			if(pocket % 2 == 0)
			{
				color = "red";
			}
			
			else
			{
				color = "black";
			}
		}
				
		if(pocket >=19 && pocket <= 28)
		{
			if(pocket % 2 == 0)
			{
				color = "black";
			}
			
			else
			{
				color = "red";
			}
		}
		
				
		if(pocket >=29 && pocket <= 36)
		{
			if(pocket % 2 == 0)
			{
				color = "red";
			}
			
			else
			{
				color = "black";
			}
		}
		return color;
	}
}