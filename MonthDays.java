public class MonthDays
{
	private int month;
	private int year;
	private int day;
	
	public MonthDays()
	{
		month = 0;
		year = 0;
	}
	
	public void setMonth(int m)
	{
		month = m;
	}
	
	public void setYear(int y)
	{
		year = y;
	}
	
	public int getMonthDays()
	{
		switch(month)
		{
			case 1:
			day = 31;
			break;
			
			case 2:
			if(year % 100 == 0 && year % 400 == 0)
			{
				day = 29;
			}
			
			else if(year % 4 == 0)
			{
				day =  29;
			}
			
			else
			{
				day =  28;
			}
			
			break;
			
			case 3:
			day =  31;
			break;
			
			case 4:
			day =  30;
			break;
			
			case 5:
			day =  31;
			break;
			
			case 6:
			day =  30;
			break;
			
			case 7:
			day =  31;
			break;
			
			case 8:
			day =  31;
			break;
			
			case 9:
			day =  30;
			break;
			
			case 10:
			day =  31;
			break;
			
			case 11:
			day =  30;
			break;
			
			case 12:
			day =  31;
			break;
		}
		return day;
	}
}