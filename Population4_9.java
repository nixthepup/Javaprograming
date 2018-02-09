import java.util.Scanner;

public class Population4_9 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);							
		int days;														
		double organisms = 0;										  
		double increaseRate = 0;									   
		
		System.out.print("Number of days to multiply: ");
		days  = input.nextInt();										
		
		System.out.print("Number of organisms:  ");					
		organisms = input.nextDouble();	
		
		
		System.out.print("Percentage of increase:  ");					
		increaseRate = input.nextDouble()/100;		
		
		while(days < 1 || organisms < 2 || increaseRate < 0){
			if (days < 1){
			System.out.print("Invalid entry Number of days to multiply. Re-enter a value greater than 1:");
			days  = input.nextInt();
			
		} if(organisms < 2){
		System.out.print("Invalid entry Number of organisms. Re-enter a value greater than 1: ");
			organisms = input.nextDouble();		
		}if(increaseRate < 0){
													
			System.out.print("Ivalid entry Percentage of increase. Re-enter a non-negative value:    ");
			increaseRate = input.nextDouble();	
		}}
		
		System.out.println("");
		
		System.out.println("Day" +"       Population" );	
		System.out.println("_______________________________________________");
		System.out.println(" 1           " + (int)organisms);
		for(int i=2; i<days + 1; i++){
			organisms += (organisms *= increaseRate);
			System.out.println("  " +i + "           " + (int)organisms +"         " + organisms);
		}
	}
}
