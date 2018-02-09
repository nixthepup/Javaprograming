import javax.swing.JOptionPane;
public class MaleAndFemale{
public static void dog(){



String inputString;
int numberOfMales;
int numberOfFemales;
int totalNumberOfStudents;
double maleper;
double feper;

inputString = JOptionPane.showInputDialog("Enter the number of males in the class.");
numberOfMales = Integer.parseInt(inputString);


inputString = JOptionPane.showInputDialog("Enter the number of females in the class.");
numberOfFemales = Integer.parseInt(inputString);


totalNumberOfStudents = numberOfMales + numberOfFemales;

maleper = ((double)numberOfMales / totalNumberOfStudents) *100;
feper = (numberOfFemales / (double)totalNumberOfStudents) *100;

JOptionPane.showMessageDialog(null, "There are " + totalNumberOfStudents + " students in the class. " + maleper + "% of students in the class are male. \n " + feper + "% of the students in the class are female.");



}
public static void main (String[] args){
dog();
System.exit(0);
}}
