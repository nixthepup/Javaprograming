import javax.swing.JOptionPane;
public class SalesPre
{
	public static void dog()
	{
	double perc = 0.62;
	double num = 4600000;
	
	double total = num * perc;
	JOptionPane.showMessageDialog(null, total);
	}
	public static void main(String[] args)
	{
		dog();
		System.exit(0);
	}
}
