import javax.swing.JOptionPane;
public class MonthDaysTest
{
	public static void main(String[] args)
	{
		MonthDays days = new MonthDays();
		days.setMonth(Integer.parseInt(JOptionPane.showInputDialog("Enter the month (1-12)")));
		days.setYear(Integer.parseInt(JOptionPane.showInputDialog("Enter the year")));
		
		System.out.println("Days: " + days.getMonthDays());
	}
}