import javax.swing.JOptionPane;
public class CiruitBoardProfit{ 
public static void dog(){

double usertetailprice;
double companyProfit;

String userOutputString = JOptionPane.showInputDialog("Enter retail price of the item");
usertetailprice = Double.parseDouble( userOutputString);

companyProfit = 0.4 * usertetailprice;

JOptionPane.showMessageDialog(null, "The profit earned on " + usertetailprice + " is $" + companyProfit );
}












public static void main (String[] args){
dog();
System.exit(0);
}}
