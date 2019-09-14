import javax.swing.JOptionPane;
public class EnergyDrinkConsumption{
public static void dog(){

int surveypeps = 12467;
double energyDrinkpeps = 0.14 * surveypeps;
double citruspeps = 0.64 * energyDrinkpeps;


JOptionPane.showMessageDialog(null, "Out of " + surveypeps + " customers," + energyDrinkpeps + " buy one or two drinks. And out of thoses " + citruspeps + " prefer citrus.");






}
public static void main (String[] args){
dog();
System.exit(0);
}}
