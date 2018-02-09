import javax.swing.JOptionPane;
public class Mass3_5{

public static void dog(){
	 
	 // vars
	 String input;
	double mass;
	double weight;
	
	//start of program
	 input = JOptionPane.showInputDialog("Enter the objects mass");
	 mass = Double.parseDouble(input);
	 
	 
	 
	 //math
	 weight = mass * 9.8;
	 
	 // rest of program
	 if (weight > 1000 ){
		 JOptionPane.showMessageDialog(null,"Object too heavy!" +weight);
	 }else if(weight < 10){
		 JOptionPane.showMessageDialog(null,"Object too light!" + weight);} else{
			 JOptionPane.showMessageDialog(null,"Object just right! " +weight);}
	 
	} 
	 public static void main (String[] args){
		 dog();
		 System.exit(0);}}
	 
