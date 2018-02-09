import java.io.*;
import javax.swing.JOptionPane;

public class dis4_3
{

	public static void dog() throws IOException
	{
	
	String hoursIn = JOptionPane.showInputDialog("Input hours");
	String speedIn = JOptionPane.showInputDialog("Input speed in mph");
	double hours = Double.parseDouble(hoursIn);
	double speed = Double.parseDouble(speedIn);
	int x = 1;
		
	PrintWriter outputFile = new PrintWriter("dis3_3.txt");
	outputFile.println("Hour\t Distance Traveled");
	outputFile.println("---------------------------");
	while(x <= hours && (hours > 0 && speed > 0))
	{
		outputFile.println(x + "\t\t" + (x * speed) + " Miles");
		x++;
	}
	outputFile.close();
	}
	
	public static void main(String[] args) throws IOException
	{
	dog();
	System.exit(0);
	}
}
