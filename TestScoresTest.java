import javax.swing.JOptionPane;
public class TestScoresTest
{
	public static void main(String[] args)
	{
		TestScores score = new TestScores();
		score.setScore1(Double.parseDouble(JOptionPane.showInputDialog("What is your first test score")));
		score.setScore2(Double.parseDouble(JOptionPane.showInputDialog("What is your second test score")));
		score.setScore3(Double.parseDouble(JOptionPane.showInputDialog("What is your third test score")));
		
		System.out.println("Score 1: " + score.getScore1() + "%");
		System.out.println("Score 2: " + score.getScore2() + "%");
		System.out.println("Score 3: " + score.getScore3() + "%");
		System.out.println("Score Average: " + score.average() + "%");
	}
}