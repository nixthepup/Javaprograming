import javax.swing.JOptionPane;

public class dis4_2
{
	public static void dog()
	{
		String time = JOptionPane.showInputDialog("Input hours");
		String speed = JOptionPane.showInputDialog("Input speed (mph)");
		double hou = Double.parseDouble(time);
		double spe = Double.parseDouble(speed);
		System.out.println("Hour\t " + "Distance Traveled");
		System.out.println("---------------------------");
		int i = 1;
		if(hou >=0 && spe >= 1)
		
		{
			while(i <=hou)
			{
				
				System.out.println(i + "\t" + (i * spe) + " Miles");
				i++;
			}
		
		}
		
		else
		{
			JOptionPane.showMessageDialog(null, "Use positive numbers and make sure speed is 1 or above", "Number outside range", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public static void main(String[] args)
	{
		dog();
	}
}
