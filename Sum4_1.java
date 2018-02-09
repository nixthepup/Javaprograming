import javax.swing.JOptionPane;

public class Sum4_1
{	

	public static void dog()
	{
		String input = JOptionPane.showInputDialog("Enter a nonzero postive number");
		int num = Integer.parseInt(input);
				int i = 0;
				int j = 0;
			while(i <= num)
			{

				
				j+=i;
				i++;
			}
		JOptionPane.showMessageDialog(null,"The total sum of all the numbers up to " + num + " is  " + j);
	}
	
	public static void main(String[] args)
	{
		dog();

	}
}
