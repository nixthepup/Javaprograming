public class Celsius4_11 {

	public static void main(String[] args) {
			
			
			System.out.println("                Temperature (Degrees)");
			System.out.println("----------------------------------------------");
			System.out.println("   Celsius " + "                  Fahrenheit");
			
		
		    
		
			int count = 20;
			double fahrenheit;
			
		
			for(int i = 0; i<=count; i++){
				fahrenheit = 9/5.0*i+32;
				System.out.println("      " + i  + "                       " +  (int)(fahrenheit));
			}
	}
}
