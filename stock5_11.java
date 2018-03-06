import javax.swing.JOptionPane;

public class stock5_11
{
	public static double calc(double NS, double PP, double PC, double SP, double SC)
	{
		return ((NS * SP) - SC) - ((NS * PP) + PC);
	}
	
	public static void main(String[] args)
	{
		double total = 0;
		double stocks = Double.parseDouble(JOptionPane.showInputDialog("How many stocks?"));
		
		for(int i = 1; i<=stocks; i++)
		{
		double NS = Double.parseDouble(JOptionPane.showInputDialog("How many shares?"));
		double PP = Double.parseDouble(JOptionPane.showInputDialog("Purchase price per share ($)?"));
		double PC = Double.parseDouble(JOptionPane.showInputDialog("Commission price paid? ($)"));
		double SP = Double.parseDouble(JOptionPane.showInputDialog("Sale price per share? ($)"));
		double SC = Double.parseDouble(JOptionPane.showInputDialog("Sale commission paid? ($)"));
		total += calc(NS,PP,PC,SP,SC);
		}
		System.out.println("You earned a total of $" + total);
	}
}
