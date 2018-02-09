import javax.swing.JOptionPane;
public class word{
public static void dog(){
String inputstring;
String name;
String city;
String college;
String job;
String petname;
String typeofpet;
int age;


name = JOptionPane.showInputDialog("Enter a name.");

city = JOptionPane.showInputDialog("Enter the name of a city.");

college= JOptionPane.showInputDialog("Enter the name of a college");

job = JOptionPane.showInputDialog("Enter a type of job");

petname = JOptionPane.showInputDialog("Enter the name of a pet");

typeofpet = JOptionPane.showInputDialog("Enter a type of animal");

inputstring = JOptionPane.showInputDialog("Enter an age");
age=Integer.parseInt(inputstring);



JOptionPane.showMessageDialog(null , "There once was a person named " + name + " who lived in " + city +  "  at the age of " + age + "\n " + name + " went to college at " + college + "\n" + name + "graduated and went to work as a " + job + " then " + name + " adopted a(n) " + typeofpet + " named " + petname + "\n they both lived happyly ever after!");}


public static void main (String[] args){
dog();
System.exit(0);
}}
