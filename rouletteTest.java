import javax.swing.JOptionPane;

public class rouletteTest
{
	public static void main(String[] args)
	{
		roulette pick = new roulette();
		pick.setPocket(Integer.parseInt(JOptionPane.showInputDialog("Input the pocket number")));
		
		System.out.println(pick.getColor());
	}
}