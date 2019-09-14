import javax.swing.JOptionPane;




public class Salestax {
	
	public static void car(){
String inputString;
double statetax = 0.04;
double countrytax = 0.02;
double purchaseAmount;
double countryTax;
double stateTax;
double totalTax;
double totalSale;

inputString = JOptionPane.showInputDialog(" Please enter the purchase amount: ");
purchaseAmount = Double.parseDouble(inputString);

countryTax = countrytax * purchaseAmount;
stateTax = statetax * purchaseAmount;
totalTax = stateTax + countryTax;
totalSale = totalTax + purchaseAmount;
JOptionPane.showMessageDialog(null, "Purchase amount $" + purchaseAmount + "\n State sales tax: $" + stateTax + "\n Country sales tax: $" + countryTax + "\n total sales tax: $" + totalTax + " \n Total cost is: $" + totalSale + ".");	
}public static void main (String[] args){

car();
System.exit(0);
}}
