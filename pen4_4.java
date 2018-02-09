import javax.swing.JOptionPane;

public class pen4_4
{
	public static void dog()
	{
		String daysIn = JOptionPane.showInputDialog("Enter days worked");
		int days = Integer.parseInt(daysIn);
		int p = 0;
		int i = 1;
		int x = 0;
		
		System.out.println("Days\t Wage");
		while(i <= days && days > 0)
		{
			
			p = (p * 2) + 1;
			double j = p / 100;
			
			System.out.println(i + "\t" + "$" + j);
			i++;
		}
	}
	
	public static void main(String[] args)
	{
		dog();
	}
}
