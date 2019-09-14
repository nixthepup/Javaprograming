import javax.swing.JOptionPane;
public class TestScores3_4{

public static void dog(){
	 
double firstScore;
double secondScore;
double thirdScore;
double average;
String inputString;
String grade;


inputString = JOptionPane.showInputDialog( "Enter first score");

firstScore = Double.parseDouble(inputString);


inputString = JOptionPane.showInputDialog( "Enter second score");
secondScore = Double.parseDouble(inputString);

inputString = JOptionPane.showInputDialog( "Enter third score");
thirdScore = Double.parseDouble(inputString);

average = (firstScore + secondScore + thirdScore) / 3;

if (average < 100 && average > 89){
grade = " A ";
JOptionPane.showMessageDialog(null,"The average of the tests score is " + average + " The letter grade is " + grade);
} else if (average < 90 && average > 79){
grade = " B ";
JOptionPane.showMessageDialog(null,"The average of the tests score is " + average + " The letter grade is " + grade);
}   else if (average < 80 && average > 69){
grade = " C ";
JOptionPane.showMessageDialog(null,"The average of the tests score is " + average + " The letter grade is " + grade);
}   else if (average < 70 && average > 59){
grade = " D ";
JOptionPane.showMessageDialog(null,"The average of the tests score is " + average + " The letter grade is " + grade);
}     else  if (average < 60){
grade = " F ";
JOptionPane.showMessageDialog(null,"The average of the tests score is " + average + " The letter grade is " + grade);
}else { 
grade  = "A +";
JOptionPane.showMessageDialog(null,"The average of the tests score is " + average + " The letter grade is " + grade);
	
	 
	}} 
	 public static void main (String[] args){
		 dog();
		 System.exit(0);}}
	 
