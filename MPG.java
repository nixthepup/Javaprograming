import javax.swing.JOptionPane;
public class MPG{
public static void dog(){
double userMiles;
double userGallons;
double milesPerGallon;
String userStringOutput;
userStringOutput = JOptionPane.showInputDialog("Enter number of miles.");
userMiles = Double.parseDouble(userStringOutput);
userStringOutput = JOptionPane.showInputDialog("Enter the gallons of gas used");
userGallons = Double.parseDouble(userStringOutput);
milesPerGallon = userMiles / userGallons;
JOptionPane.showMessageDialog(null, "Miles per gallons is " + milesPerGallon);}

public static void main (String[] args){
dog();
System.exit(0);}}
