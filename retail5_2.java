import javax.swing.*;
public class retail5_2{
	
	  public static void main(String args[]) {
       
        double wholeCost = 0.0; 
        double mUp = 0.0;   
       
       String temp = JOptionPane.showInputDialog("Enter wholesale price");
       wholeCost = Double.parseDouble(temp);

        
       temp = JOptionPane.showInputDialog("Enter mark up .");
        mUp = Double.parseDouble(temp);
     
        calculateRetail(wholeCost, mUp);
    }

    public static double calculateRetail(double wC, double markUp) {
        double result = (wC + wC * (markUp / 100));
        JOptionPane.showMessageDialog(null,result);
        return result;
    }

}
