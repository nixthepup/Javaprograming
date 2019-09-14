import javax.swing.JOptionPane;

public class ShippingCharges3_9
{
	public static void dog()
	{
	String inputlb = JOptionPane.showInputDialog("Input pounds");
	String inputmi = JOptionPane.showInputDialog("Input miles");
	double pounds = Double.parseDouble(inputlb);
	double miles = Double.parseDouble(inputmi);
	double multi = (miles + 499) / 500;
	int m = (int)multi;
	
	if(pounds <= 2)
	{
		JOptionPane.showMessageDialog(null,String.format("$%.2f", 1.10 * m));
	}
	
	else if(pounds >2 && pounds <= 6)
	{
		JOptionPane.showMessageDialog(null,String.format("$%.2f", 2.20 * m));
	}
	
	else if(pounds > 6 && pounds <= 10)
	{
		JOptionPane.showMessageDialog(null,String.format("$%.2f", 3.70 * m));
	}
	
	else if(pounds > 10)
	{
		JOptionPane.showMessageDialog(null,String.format("$%.2f", 3.80 * m));
	}
	}
	public static void main(String[] args)
	{
		dog();
	}
}
