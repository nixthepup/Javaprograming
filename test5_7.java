import javax.swing.*;
public class test5_7{
	
	
	
	public static void getvar(){
	  
		  int i = 1;
		double test1 = 0;
		 double test2 = 0;
		  double test3 = 0;
		  double test4 = 0;
		  double test5 = 0;
		  while(i!=6){
		String temp = JOptionPane.showInputDialog("Enter the " + i + " test score");
	  if (i==1){
		  test1 = Double.parseDouble(temp);
	  }else if(i==2){
		  test2 = Double.parseDouble(temp);
	  }else if(i==3){
		  test4 = Double.parseDouble(temp);
	  }else if(i==4){
		  test4 = Double.parseDouble(temp);}else if(i==5){
		  test5 = Double.parseDouble(temp);
		  
	  }i++;}
	  calcAverage(test1,test2,test3,test4,test5);
	  
	  }
	  
	  
	  public static void calcAverage(double test1,double test2,double test3,double test4,double test5){
		  double average = (test1+test2+test3+test4+test5) / 5;
		  determineGrade(average);
		  }
		  
		  public static void determineGrade(double average){
			  double av = average;
			  if (av >= 90) {
            System.out.println("You got " + (int)av + "   an A");
        } else if (av >= 80) {
            System.out.println("You got " + (int)av + "   a B");
        } else if (av >= 70) {
            System.out.println("You got " +(int) av + "   a C");
        } else if (av >= 60) {
            System.out.println("You got " + (int)av + "  D");
        } else if (av < 60) {
            System.out.println("You got " + (int)av + "   F");
        }}
	  
	  
	  public static void main(String args[]) {
    getvar();
    }

  
    















































































}
