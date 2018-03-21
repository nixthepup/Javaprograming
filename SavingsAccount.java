public class SavingsAccount
{
   
   private double balance; 
   private double annualInterestRate; 
   private double monthlyInterestRate; 
   private double totalDeposits; 
   private double totalWithdraws; 
   private double totalInterest; 

  
    public SavingsAccount(double startBalance, double annual_Interest_Rate)
    {
        balance = startBalance;
        annualInterestRate = annual_Interest_Rate; 
    }
 

 
   public void setAnnualInterestRate(double annual_Interest_Rate)
   {
       monthlyInterestRate = annualInterestRate / 12; 
   }
   

 
   public void setDeposit(double amount)
   {
       balance += amount; 
       totalDeposits += amount; 
   }
  
   /**
    * The withdraw method subtracts the amount to the balance
    * and calculates the total withdraws
    * @param amount
    */
   public void setWithdraw(double amount)
   {
       balance -= amount; 
       totalWithdraws += amount; 
   }
   
  
   public void calculateMonthlyInterest()
   {
       totalInterest = totalInterest + balance * monthlyInterestRate; 
       balance = balance + balance * monthlyInterestRate; 
   }
   

  
   public double getBalance()
   {
       return balance; 
   }

   
   public double getAnnualInterestRate()
   {
       return annualInterestRate; 
   }

  
   public double getMonthlyInterestRate()
   {
       return monthlyInterestRate; 
   }

   
   public double getTotalDeposits()
   {
       return totalDeposits; 
   }

   
   public double getTotalWithdraws()
   {
       return totalWithdraws; 
   }

  
   public double getTotalnterest()
   {
       return totalInterest; 
   }

 
   public void displayData()
   {
       balance = Math.round(balance * 100.0) / 100.0; 
       totalInterest = Math.round(totalInterest * 100.0) / 100.0; 
       System.out.println(); 
       System.out.println("The ending balance is: $" + balance); 
       System.out.println("Total amount of deposits: $" + totalDeposits);
       System.out.println("Total amount of withdraws: $" + totalWithdraws);
       System.out.println("Total interest earned: $" + totalInterest);
   }
   
}

