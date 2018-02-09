import javax.swing.JOptionPane;

public class Soundspeed3_12
{
	public static void dog()
	{
		String input = JOptionPane.showInputDialog("Enter air, water, or steel");
		
		String dis = JOptionPane.showInputDialog("Input distance");
		double distance = Double.parseDouble(dis);

		
		if(input.equalsIgnoreCase("air"))
		{
			JOptionPane.showMessageDialog(null,distance / 1100 + " seconds");
		}
		
		else if(input.equalsIgnoreCase("water"))
		{
			JOptionPane.showMessageDialog(null,distance / 4900 + "seconds");
		}
		
		else if(input.equalsIgnoreCase("steel"))
		{
			JOptionPane.showMessageDialog(null,distance / 16400 + " seconds");
		}else{JOptionPane.showMessageDialog(null,input + " Not Allowed \nPlease Enter air,water, or steel","Invalid Input",JOptionPane.ERROR_MESSAGE);
	dog();}}
	
	public static void main(String[] args)
	{
		dog();
	}
}
