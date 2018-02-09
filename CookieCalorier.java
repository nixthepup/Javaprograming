import javax.swing.JOptionPane;

public class CookieCalorier{

public static void dog(){
String userstringinput;
double usernumberofcookies;
double usernumberofservings;
double numberofcalories;

userstringinput = JOptionPane.showInputDialog("Please enter the number of cookies" );
usernumberofcookies = Double.parseDouble(userstringinput);
usernumberofservings = (usernumberofcookies / 40) * 10;
numberofcalories = (usernumberofservings / 1 ) *300;

JOptionPane.showMessageDialog( null,usernumberofcookies + " cookies is equal to " + numberofcalories + " calories (" + usernumberofservings + " servings )");}

public static void main (String[] args){
dog();
System.exit(0);}}











