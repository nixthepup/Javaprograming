import javax.swing.JOptionPane;

public class Bank3_15
{
	public static void dog()
	{
	String input = JOptionPane.showInputDialog("Input number of written checks");
	double checks = Double.parseDouble(input);
	
		if(checks < 20)
		{
			JOptionPane.showMessageDialog(null,"$" + (10.0 + .10 * checks));
		}
	
		else if(checks >= 20 && checks <= 39)
		{
			JOptionPane.showMessageDialog(null,"$" + (10.0 + .08 * checks));
		}
	
		else if(checks >= 40 && checks <= 59)
		{
			JOptionPane.showMessageDialog(null,"$" + (10.0 + .06 * checks));
		}
		
		else if(checks >= 60)
		{
			JOptionPane.showMessageDialog(null,"$" + (10.0 + .04 * checks));
		}
	}
	
	public static void main(String[] args)
	{
		dog();
	}
}
