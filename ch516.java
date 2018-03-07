import javax.swing.JOptionPane;


public class ch516
{
	public static double presentValue(double r, double n, double F)
	{
		return F / ((1 + r) * (1 + r));
	}
	
	public static void main(String[] args)
	{
		double r = Double.parseDouble(JOptionPane.showInputDialog("What is the annual interest rate?"));
		double n = Double.parseDouble(JOptionPane.showInputDialog("How many years will the money be there?"));
		double P = 0;
		double F = 10000;
		P = presentValue(r, n, F);
		System.out.printf("$" + "%.2f", P );
	}
}

