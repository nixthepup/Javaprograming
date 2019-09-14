import javax.swing.JOptionPane;
public class LandCal
{
	public static void dog()
	{
	double acre = 43560;
	double feet = 389767;
	double total = feet / acre;
	JOptionPane.showMessageDialog(null,total + " (Number of acres)");
	}
	public static void main(String[] args)
	{
	dog();
	System.exit(0);
	}
}
