/**
   You must complete this program so it calculates
   and displays the area of a rectangle. 
*/

// Insert any necessary import statements here.
import javax.swing.*;
public class Area5_3
{
  public static void main(String[] args) 
  {  
      


  
      double length;    // The rectangle's length
      double width;     // The rectangle's width
      double area;      // The rectangle's area

      // Get the rectangle's length from the user.
      length = getLength();

      // Get the rectangle's width from the user.
      width = getWidth();

      // Get the rectangle's area.
      area = getArea(length, width);

      // Display the rectangle data.
      displayData(length, width, area);

      System.exit(0);
   }

   public static double getLength()
   {
    

      String input = JOptionPane.showInputDialog("Enter the  length.");
      return Double.parseDouble(input);
   }


   public static double getWidth()
   {
              

      String input = JOptionPane.showInputDialog("Enter the  width.");
      return Double.parseDouble(input);
   }


   public static double getArea(double length, double width)
   {
      return length * width;
   }
   
   public static void  displayData (double length, double width, double area)
   {
    JOptionPane.showMessageDialog(null," Length " + length + " * Width " 
            + width + " = " + area );
   }
  





}

