import javax.swing.JOptionPane;

public class distance5_9
{
	public static double distance(double speed, double time)
	{
	return speed * time;
	
	}
	
	public static void main(String[] args)
	{
	double speed = Double.parseDouble(JOptionPane.showInputDialog("What speed is the vehicle traveling at?"));
	double time = Double.parseDouble(JOptionPane.showInputDialog("How long did the vehicle travel?"));
	System.out.println(distance(speed, time) + " miles");
	}
}
