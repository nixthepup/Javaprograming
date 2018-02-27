import javax.swing.JOptionPane;
import java.text.*


public class paintJob5_4 {

    public static void main(String[] args) {

        double gallonOfPaint;     // Gallons of paint
        double hoursOfLabor;      //   Labor hours
        double costOfPaint;       // Cost of paint
        double laborCharges;      // Labor charges
        double totalCostofJob;    // Total cost
        double numOfRooms;   // Holds number of rooms to be painted
        double wallSpace;       //  Holds wall space
        String input;        // To hold keyboard input
        String input2;        // To hold2nd keyboard input
        double sumWall;     // Hold total wall space
        double squFt = 115;  // per every 115 sqft a gallon of paint is needed and 8 hrs or labor
        double chargeLabor = 18;  // cost of labor

   

        gallonOfPaint = getGallons();
        //System.out.println(gallonOfPaint); // test the gallonOfPaint var

        hoursOfLabor = getLabor(gallonOfPaint);
        //System.out.println(" hours of labor main" +hoursOfLabor); // testing code

     
        costOfPaint = getCostOfPaint(gallonOfPaint);

    
        laborCharges = getLaborCharges(hoursOfLabor);

      
        totalCostofJob = calculateTotalCost( laborCharges,costOfPaint);
       
        displayResults(laborCharges,costOfPaint,totalCostofJob,
                gallonOfPaint,  hoursOfLabor);
   
        System.exit(0);
    }

    
  
    public static double getGallons() {
        double squFt = 115; // every 115 sqft of wall space needs 1 gallon and 8 labor
        String input; // holds user's input
        double numOfRooms; // holds number of rooms
        String input2;  // holds user's second input
        double wallSpace; // holds wall space amount
        double sumWall = 0.0; // sum of wall space
        double gallonNeeded;  // total gallons of paint needed
          // gets number of rooms
        input = JOptionPane.showInputDialog("Enter the number of rooms to be painted .");
        numOfRooms = Double.parseDouble(input);
             // gets wall space
        for (int i = 1; i <= numOfRooms; i++) 
        {
            input2 = JOptionPane.showInputDialog("Enter the wall space for room number " + i);
            wallSpace = Double.parseDouble(input2);

            sumWall += wallSpace;
            // Code for testing output.
            //System.out.println(sumWall);
            //System.out.println(squFt);
            
        }

        gallonNeeded = (sumWall / squFt);
        //System.out.println("gallons " +gallonNeeded); // testing code
        return gallonNeeded;
    }

    
    public static double getLabor(double gallonsNeeded) {
        double laborHours = (gallonsNeeded * 8);
      
        //System.out.println("Labor hours not in main" +laborHours);// testing code

        return laborHours;

    }

    // Calculate labor
    public static double getCostOfPaint(double gallonsNeeded) {
        String input;
        double paintPrice;
        input = JOptionPane.showInputDialog("Enter price per gallon of paint .");
        paintPrice = Double.parseDouble(input);
        double spentOnPaint = gallonsNeeded * paintPrice;

        // System.out.println(gallonsNeeded * paintPrice); // code for testing
        return spentOnPaint;
    }

    public static double getLaborCharges(double laborHours) {

        double money = ( (laborHours * 18) );

       // System.out.println("Labor" + money); // code for testing
        return money;
    }
    
   public static double  calculateTotalCost(double money, double spentOnPaint){
        double totalAmount = (money + spentOnPaint);
        //System.out.println("total" +totalAmount);// testing code
       return totalAmount;}
       
    /**
     *
     * @param laborCharges
     * @param costOfPaint
     * @param totalCostofJob
     */
    public static void displayResults(double laborCharges,double costOfPaint,
        double totalCostofJob, double  gallonOfPaint ,double   hoursOfLabor)
    {
        DecimalFormat formatter = new DecimalFormat( "$0.00");
         DecimalFormat notMoney = new DecimalFormat( "#0.0");
        
         JOptionPane.showMessageDialog(null,"Gallons needed :" 
                 + notMoney.format(gallonOfPaint) +  "\n" + 
                 "Labor hours needed : " + notMoney.format(hoursOfLabor) + "\n"
                 + "Cost of paint : " 
                 + formatter.format(costOfPaint) + "\n" + "Cost of labor :" 
                 + formatter.format(laborCharges) + "\n" 
                        + "Total cost of job :"
                 + formatter.format(totalCostofJob));
       
       
   }    

}
