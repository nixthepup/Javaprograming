import javax.swing.JOptionPane;
public class StockTransaction{
public static void dog(){

int sharesbought = 1000;
double priceboughtpershare = 32.87;
double amountpaidforstock = sharesbought *priceboughtpershare;
double commission = 0.02 * amountpaidforstock;

int sharessold = 1000;
double pricesoldpershare = 33.92;
double amountforstock = sharessold * pricesoldpershare;
double commissionforselling = 0.02 *amountforstock;
double moneymade = (amountforstock - commissionforselling ) - (amountpaidforstock - commission);

JOptionPane.showMessageDialog(null,"Amount of money joe paid for the stock: " + amountpaidforstock +"\n Amount of commission joe paid for buying the stock: " + commission +"\n Amount of money joe got for the stock: " + commission +"\n Amount of commission joe paid for selling the stock: " + commissionforselling +"\n Amount of profit joe made: " + moneymade );







}
public static void main (String[] args){
dog();
System.exit(0);
}}
