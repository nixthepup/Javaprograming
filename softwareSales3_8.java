import javax.swing.JOptionPane;

public class softwareSales3_8
{
	public static void dog()
	{
		String input = JOptionPane.showInputDialog(" How many packages did you buy?");
		int packs = Integer.parseInt(input);
		double total = packs *99;
		
	    double disc1 = total*0.2;
        double total2 = total-disc1;
        double disc2 = total *0.3;
        double total3 = total-disc2;
        double disc3 = total *0.4;
        double total4 = total-disc3;
        double disc4 = total *0.5;
        double total5 = total-disc4;


        if(packs < 10)
        {
			JOptionPane.showMessageDialog(null,"No discount");
		}
        else if(packs >= 10 && packs <=19)
        {
			System.out.println("Your discount is 20%");
			System.out.printf("Your total is $%,.2f\n" , total2);
		}
        else if(packs >= 20 && packs <=	49)
        {
			System.out.println("Your discount is 30%");
			System.out.printf("Your total is $%,.2f\n" , total3);
		}
        else if(packs >=50 && packs <=99)
        {
			System.out.println("Your discount is 40%");
			System.out.printf("Your total is $%,.2f\n" , total4);
		}
        else if(packs >=100)
        {
			System.out.println("Your discount is 50%");
			System.out.printf("Your total is $%,.2f\n" , total5);
		}			
	}
	public static void main(String[] args)
	{
		dog();
		System.exit(0);
	}
}                                                                                               