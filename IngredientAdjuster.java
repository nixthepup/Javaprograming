import javax.swing.JOptionPane;
public class IngredientAdjuster  {
public static void dog(){

//delte after fixing

String inputString;
double cupsOfSugarper48 = 1.5;
double cupsOfButterper48 = 1;
double cupsOfFlourper48 = 2.75;
int regBatch = 48;
int userNumberofcookies;


double expectedCupsofsurger;
double expectedCupsofbutter;
double expectedCupsofflour;


inputString = JOptionPane.showInputDialog("Enter the number of cookies.");
userNumberofcookies = Integer.parseInt(inputString);


 expectedCupsofsurger = ((double)userNumberofcookies / regBatch ) * cupsOfSugarper48;
expectedCupsofbutter = (userNumberofcookies / (double)regBatch ) * cupsOfButterper48;
 expectedCupsofflour = ((double)userNumberofcookies / regBatch ) * cupsOfFlourper48;

JOptionPane.showMessageDialog(null, "For " + userNumberofcookies + " cookies you will need " + expectedCupsofsurger + " cups of suger \n" + expectedCupsofbutter + " of butter  \n" + expectedCupsofflour+ " cups of flour");











}
public static void main (String[] args){
dog();
System.exit(0);
}}
