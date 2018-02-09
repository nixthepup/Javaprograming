import javax.swing.JOptionPane;
public class BMI3_3{

public static void dog(){
	 
	 // vars
	 String input;
	double userweight;
	double userheight;
	double bmi;
	
	//start of program
	 input = JOptionPane.showInputDialog("Enter your weight dont worry I wont tell anyone");
	 userweight = Double.parseDouble(input);
	 
	 JOptionPane.showInputDialog("Enter your height ");
	 userheight = Double.parseDouble(input);
	 
	 //math
	 bmi = (userweight * 703 ) / (userheight * userheight);
	 
	 // rest of program
	 if (bmi < 18.5 ){
		 JOptionPane.showMessageDialog(null,"You are underweight go see you family doctor for more help or webMD");
	 }else if(bmi < 26){
		 JOptionPane.showMessageDialog(null,"You are at an Optimal weight");} else{
			 JOptionPane.showMessageDialog(null,"You are overweight go see you family doctor for more help or webMD");}
	 
	} 
	 public static void main (String[] args){
		 dog();
		 System.exit(0);}}
	 
