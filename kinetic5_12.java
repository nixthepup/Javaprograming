import javax.swing.JOptionPane;

public class kinetic5_12
{
	public static double kinetic(double mass, double velocity)
	{
	return 0.5 * mass * (velocity * velocity);
	
	}
	
	public static void main(String[] args)
	{
	double mass = Double.parseDouble(JOptionPane.showInputDialog("What is the mass of the object (kg))?"));
	double velocity = Double.parseDouble(JOptionPane.showInputDialog("What is the object's velocity (meters per second)?"));
	System.out.println("The object has " + kinetic(mass, velocity) + " kinetic energy");
	}
}
