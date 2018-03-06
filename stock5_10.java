import javax.swing.JOptionPane;

public class stock5_10
{
	public static double calc(double NS, double PP, double PC, double SP, double SC)
	{
		return ((NS * SP) - SC) - ((NS * PP) + PC);
	}
	
	public static void main(String[] args)
	{
		double NS = Double.parseDouble(JOptionPane.showInputDialog("How many shares?"));
		double PP = Double.parseDouble(JOptionPane.showInputDialog("Purchase price per share ($)?"));
		double PC = Double.parseDouble(JOptionPane.showInputDialog("Commission price paid? ($)"));
		double SP = Double.parseDouble(JOptionPane.showInputDialog("Sale price per share? ($)"));
		double SC = Double.parseDouble(JOptionPane.showInputDialog("Sale commission paid? ($)"));
		System.out.println("You got $" + calc(NS,PP,PC,SP,SC) + " from your stocks");
	}
}
