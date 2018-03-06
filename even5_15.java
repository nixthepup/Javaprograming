import java.util.Random;

public class even5_15
{
	public static int isEven(double randomNum)
	{
		if ((randomNum % 2) == 0)
		{
			return 1;
		}
		
		else
		{
			return 0;
		}
	}
	
	public static void main(String[] args)
	{
		int even = 0;
		int odd =0;
		for(int i = 1; i<=100; i++)
		{
		
		Random num = new Random();
		int randomNum = num.nextInt(100) + 1;65
		
		
		if (isEven(randomNum) == 1)
		{
			even += 1;
		}
		
		else
		{
			odd += 1;
		}
		}
		
		System.out.println("Evens: "  + even + " Odds: " + odd);
	}
}
