public class TestScores
{
	private double score1;
	private double score2;
	private double score3;
	
	public TestScores()
	{
		score1 = 0;
		score2 = 0;
		score3 = 0;
	}
	
	public void setScore1(double s1)
	{
		score1 = s1;
	}
	
	public void setScore2(double s2)
	{
		score2 = s2;
	}
	
	public void setScore3(double s3)
	{
		score3 = s3;
	}
	
	public double getScore1()
	{
		return score1;
	}

	public double getScore2()
	{
		return score2;
	}
	
	public double getScore3()
	{
		return score3;
	}
	
	public double average()
	{
		return ((score1 + score2 + score3) / 3);
	}
}