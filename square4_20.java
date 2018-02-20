import javax.swing.JOptionPane;

public class square4_20
{
	public static void dog()
	{
		String numberIn = JOptionPane.showInputDialog("Enter the number for the square");
		int number = Integer.parseInt(numberIn);
		int row = 0;
		int col = 0;
		if(number >= 1 && number <= 15)
		{
		for(row=1; row <= number; row++)
		{
			for(col = 1; col <= number; col++)
			{
				System.out.print("X");
				
			}
			System.out.print("\n");
		}
		}
		
		else
		{
			JOptionPane.showMessageDialog(null, "Number must be between 1 and 15", "Error!", JOptionPane.ERROR_MESSAGE);
			dog();
		}
	}
	
	public static void main(String[] args)
	{
		dog();
		System.exit(0);
	}
}
