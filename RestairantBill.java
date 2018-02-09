import javax.swing.JOptionPane;
public class RestairantBill{
	
public static void dog(){
	
	String inputString;
	double mealcost;
	double tax;
	double totalcost;
	double tip;
	double totalbill;
	
inputString = JOptionPane.showInputDialog("Enter the cost of the meal: ");
mealcost = Double.parseDouble(inputString);

	
	tax = 0.675 * mealcost;
	totalcost = mealcost + tax;
	
	tip = 0.2 * totalcost;
	
	totalbill = totalcost + tip;
	
JOptionPane.showMessageDialog(null, " Cost of meal $: $" + mealcost +" \nTax: $" + tax +"\n Tip: $" + tip + "\n Cost of meal : $" + mealcost + "\n Your Bill is: $" + totalbill);
}
	
	
	public static void main (String[] args){
		dog();
		System.exit(0);}}
