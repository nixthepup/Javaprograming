
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;


public class Random4_18 {
    public static void main(String[] args) throws IOException 
    {
        int number1 =0;
         int max=0 ;
         int counter = 1;
        
         Scanner input = new Scanner (System.in);
         
      
         Random randomNumbers =new Random();
        
    
          number1 = randomNumbers.nextInt(100);
           
        
           System.out.println( number1); 
      
           System.out.println(" Guess what the number is. ");
          
  
       
        while ( (max = input.nextInt()) != number1)
        {
             
             if (max > number1)
                 System.out.println( " Number is too high.Try again.");
                
             else if(max < number1)
                      
              System.out.println( " Number is too low.Try again.");
              
             counter++;
             
        }
             
         System.out.println( "Correct guess!" );
         System.out.println( " Number of guesses : " +counter );

         System.exit(0);
    }
}
     
