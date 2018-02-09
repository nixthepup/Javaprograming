import javax.swing.JOptionPane;
public class MagicDates3_2{

public static void dog(){
	 
	 // vars
	 String input;
	 int usermonth;
	 int userday;
	 int useryear;
	 
	 // ask for month
	 input = JOptionPane.showInputDialog("Enter a month in numeric form");
	usermonth =  Integer.parseInt(input);
	 
	 // ask for day
	 input = JOptionPane.showInputDialog("Enter a day in numeric form");
	 userday = Integer.parseInt(input);
	 
	 // ask for year
	 input = JOptionPane.showInputDialog("Enter a year in numeric form");
	 useryear = Integer.parseInt(input);
	 
	 if (( usermonth * userday) == useryear){
		 JOptionPane.showMessageDialog(null,"Thats date is magic!");
	 }else{JOptionPane.showMessageDialog(null,"That date is not magic");}}
	 
	 
	 public static void main (String[] args){
		 dog();
		 System.exit(0);}}
	 
