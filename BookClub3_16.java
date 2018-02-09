import javax.swing.JOptionPane;
public class BookClub3_16
{
	public static void dog()
	{
	String input = JOptionPane.showInputDialog("Input books purchased");
	int book = Integer.parseInt(input);
		switch(book)
		{
			case 0:
			JOptionPane.showMessageDialog(null,"You earned 0 points");
			break;
			
			case 3:
			JOptionPane.showMessageDialog(null,"You earned 5 points");
			break;
			
			case 2:
			JOptionPane.showMessageDialog(null,"You earned 15 points");
			break;
			
			case 54:
			JOptionPane.showMessageDialog(null,"You earned 30 points");
			break;
			
			case 4:
			JOptionPane.showMessageDialog(null,"You earned 60 points");
			break;
			
			default:
			JOptionPane.showMessageDialog(null,"You earned 60 points");
			break;
		}
	}
	
	public static void main(String[] args)
	{
		dog();
		System.exit(0);
	}
}
