import javax.swing.*;
public class test{
	
	
	
	public static void getvar(){
	  
		  int i = 1;
		double test1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the " + i + " test score"));
		i++;
		 double test2 =Double.parseDouble(JOptionPane.showInputDialog("Enter the " + i + " test score"));
		 i++;
		  double test3 = Double.parseDouble(JOptionPane.showInputDialog("Enter the " + i + " test score"));
		  i++;
		  double test4 =Double.parseDouble(JOptionPane.showInputDialog("Enter the " + i + " test score"));
		  i++;
		  double test5 =Double.parseDouble(JOptionPane.showInputDialog("Enter the " + i + " test score"));
		  
		 /* while(i!=6){
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
		  
	  }i++;}*/
	  calcAverage(test1,test2,test3,test4,test5);
	  
	  }
	  
	  
	  public static void calcAverage(double test1,double test2,double test3,double test4,double test5){
		  double average = (test1+test2+test3+test4+test5) / 5;
		  determineGrade(average,test1,test2,test3,test4,test5);
		  }
		  
		  public static void determineGrade(double average,double test1,double test2,double test3,double test4,double test5){
			  double av = average;
			  String gradeforav="nix";
			  String letter1="nix";
			  String letter2="nix";
			  String letter3="nix";
			  String letter4="nix";
			  String letter5="nix";
			  
			  if (av >= 90) {
            gradeforav ="A";
        } else if (av >= 80) {
            gradeforav =" B";
        } else if (av >= 70) {
            gradeforav =" C";
        } else if (av >= 60) {
            gradeforav =" D";
        } else if (av < 60) {
            gradeforav =" F";
        }
        
        if (test1 >= 90) {
            letter1 ="A";
        } else if (test1 >= 80) {
           letter1 =" B";
        } else if (test1 >= 70) {
            letter1 =" C";
        } else if (test1 >= 60) {
            letter1 =" D";
        } else if (test1 < 60) {
            letter1 =" F";
        }
        
         if (test2 >= 90) {
            letter2 ="A";
        } else if (test2 >= 80) {
           letter2 =" B";
        } else if (test2 >= 70) {
            letter2 =" C";
        } else if (test2 >= 60) {
            letter2 =" D";
        } else if (test2 < 60) {
            letter2 =" F";
        }
        
         if (test3 >= 90) {
            letter3 ="A";
        } else if (test3 >= 80) {
           letter3 =" B";
        } else if (test3 >= 70) {
            letter3 =" C";
        } else if (test3 >= 60) {
            letter3 =" D";
        } else if (test3 < 60) {
            letter3 =" F";
        }
        
         if (test4 >= 90) {
            letter4 ="A";
        } else if (test4 >= 80) {
           letter4 =" B";
        } else if (test4 >= 70) {
            letter4 =" C";
        } else if (test4 >= 60) {
            letter4 =" D";
        } else if (test4 < 60) {
            letter4 =" F";
        }
        
         if (test5 >= 90) {
            letter5 ="A";
        } else if (test5 >= 80) {
           letter5 =" B";
        } else if (test5 >= 70) {
            letter5 =" C";
        } else if (test5 >= 60) {
            letter5 =" D";
        } else if (test5 < 60) {
            letter5 =" F";
        }
        
        
        
        System.out.print("Test 1:"+(int)test1 + " letter grade:"+letter1+ "\n Test2:"+(int)test2 + " letter grade:"+letter2 + "\n Test3:"+(int)test3 + " letter grade:"+letter3 +"\n Test 4:"+(int)test4 + " letter grade:"+letter4 + "\n Test 5:"+(int)test5 + " letter grade:"+letter5 + "\n The avervge of all the tests scores is " + av + " and the letter grade is " + gradeforav);
	}
	  
	  
	  public static void main(String args[]) {
    getvar();
    }
}
