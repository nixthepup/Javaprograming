import javax.swing.JOptionPane;
public class StockCommission{
public static void dog(){
 double stockTotal = 21.77 * 600;
 double stockCommission = 0.02 * stockTotal;
 double totalAmount = stockTotal + stockCommission;


JOptionPane.showMessageDialog(null, " Kathryn paid " + stockTotal + " for the shares before commission\n She paid " + stockCommission + " to her stock broker as her commission\n paying a total of " + totalAmount );







}
public static void main (String[] args){
dog();
System.exit(0);
}}
