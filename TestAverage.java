import javax.swing.JOptionPane;
public class TestAverage{
public static void dog(){



double firstScore;
double secondScore;
double thirdScore;
double average;
String inputString;


inputString = JOptionPane.showInputDialog( "Enter first score");

firstScore = Double.parseDouble(inputString);


inputString = JOptionPane.showInputDialog( "Enter second score");
secondScore = Double.parseDouble(inputString);

inputString = JOptionPane.showInputDialog( "Enter third score");
thirdScore = Double.parseDouble(inputString);

average = (firstScore + secondScore + thirdScore) / 3;

JOptionPane.showMessageDialog(null, "The average of " + firstScore + " , " + secondScore + "  and  " +thirdScore + " is " +average );}

public static void main (String[] args){ 
	dog();
	System.exit(0);}} 
