import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
public class budget4_16
//must download expenses.txt also
{
	public static void calc() throws IOException
	{
	
		String temp;
		int cost=0;
		double budget1=0;
		int total=0;
		File file = new File("expenses.txt");
		Scanner inputFile = new Scanner(file);
		temp = JOptionPane.showInputDialog("Enter your budget");
		budget1 = Double.parseDouble(temp);
		while(inputFile.hasNext())
		{
			String expense = inputFile.nextLine();
			temp = JOptionPane.showInputDialog("Enter the expense for " + expense);
			 cost = Integer.parseInt(temp);
		
		System.out.println(expense + "\t************\t$" + cost);
		total = total + cost;
		
	}
	
		System.out.println("Starting Budget: $" +(int)budget1);
		System.out.println("total cost: $" + total);
		if (budget1 > total){
			System.out.println("You are under budget by $" + (int)(budget1-total));
		}else{ System.out.print("You are over budget by $" + (int)(budget1-total) );
}}


public static void main(String[] args) throws IOException
{
	calc();
}

}
