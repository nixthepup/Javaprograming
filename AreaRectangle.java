/**
   You must complete this program so it calculates
   and displays the area of a rectangle. 
*/
import javax.swing.JOptionPane;
// Insert any necessary import statements here.

public class AreaRectangle
{

		  
	public static double len()
	  {
       
	  return Double.parseDouble(JOptionPane.showInputDialog("Insert the length"));
	  }
	  
	public static double wid()
	  {
     
	  return Double.parseDouble(JOptionPane.showInputDialog("Insert the width"));
	  }
	  
	  
	public static double ar(double length, double width)
	{
	
		return length*width;
		
	}  
	  
	public static void so(double area, double width, double length)
	{
		System.out.println("Length: " + length + " Width: " + width + " Area: " + area);
	}
	  
   public static void main(String[] args)
   {
      double length, width, area;      
	
	length = len();
	width = wid();
	area = ar(length, width);
	so(area, width, length);
   }
}
