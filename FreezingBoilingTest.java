import javax.swing.JOptionPane;
public class FreezingBoilingTest
{
	public static void main(String[] args)
	{
		FreezingBoiling temp = new FreezingBoiling();
		temp.setTemp(Double.parseDouble(JOptionPane.showInputDialog("Enter the temperature")));
		
		System.out.println("Is water boiling? " + temp.isWaterBoiling());
		System.out.println("Is ethyl alcohol boiling? " + temp.isEthylBoiling());
		System.out.println("Is oxygen boiling? " + temp.isOxygenBoiling());
		
		System.out.println("Is water freezing? " + temp.isWaterFreezing());
		System.out.println("Is ethyl alcohol freezing? " + temp.isEthylFreezing());
		System.out.println("Is oxygen freezing? " + temp.isOxygenFreezing());
	}
}