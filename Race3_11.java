import javax.swing.JOptionPane;

public class Race3_11
{
	public static void dog()
	{
		String name1 = JOptionPane.showInputDialog("Enter name of runner 1");
			String name2 = JOptionPane.showInputDialog("Enter name of runner 2");
			String name3 = JOptionPane.showInputDialog("Enter name of runner 3");
		
		String inputtime1 = JOptionPane.showInputDialog("Enter time of runner 1 (minutes)");	
		String inputtime2 = JOptionPane.showInputDialog("Enter time of runner 2 (minutes)");
		String inputtime3 = JOptionPane.showInputDialog("Enter time of runner 3 (minutes)");
		
		double time1 = Double.parseDouble(inputtime1);
		double time2 = Double.parseDouble(inputtime2);
		double time3 = Double.parseDouble(inputtime3);
		
		if(time1 < time2 && time1 < time3)
		{
			JOptionPane.showMessageDialog(null,"Name: " + name1 + " Time: " + time1 + " minutes");
			
			if(time2 < time3)
			{
				JOptionPane.showMessageDialog(null,"Name: " + name2 + " Time: " + time2 + " minutes");
				JOptionPane.showMessageDialog(null,"Name: " + name3 + " Time: " + time3 + " minutes");
			}
			
			else
			{
				JOptionPane.showMessageDialog(null,"Name: " + name3 + " Time: " + time3 + " minutes");
				JOptionPane.showMessageDialog(null,"Name: " + name2 + " Time: " + time2 + " minutes");
			}
		}
		
		if(time2 < time1 && time2 < time3)
		{
			JOptionPane.showMessageDialog(null,"Name: " + name2 + " Time: " + time2 + " minutes");
			
			if(time1 < time3)
			{
				JOptionPane.showMessageDialog(null,"Name: " + name1 + " Time: " + time1 + " minutes");
				JOptionPane.showMessageDialog(null,"Name: " + name3 + " Time: " + time3 + " minutes");
			}
			
			else
			{
				JOptionPane.showMessageDialog(null,"Name: " + name3 + " Time: " + time3 + " minutes");
				JOptionPane.showMessageDialog(null,"Name: " + name1 + " Time: " + time1 + " minutes");
			}
		}
		
		if(time3 < time1 && time3 < time2)
		{
			JOptionPane.showMessageDialog(null,"Name: " + name3 + " Time: " + time3 + " minutes");
			
			if(time1 < time2)
			{
				JOptionPane.showMessageDialog(null,"Name: " + name1 + " Time: " + time1 + " minutes");
				JOptionPane.showMessageDialog(null,"Name: " + name2 + " Time: " + time2 + " minutes");
			}
			
			else
			{
				JOptionPane.showMessageDialog(null,"Name: " + name2 + " Time: " + time2 + " minutes");
				JOptionPane.showMessageDialog(null,"Name: " + name1 + " Time: " + time1 + " minutes");
			}
		}
	}
	
	public static void main(String[] args)
	{
		dog();
	}
}
