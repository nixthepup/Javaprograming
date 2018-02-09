import javax.swing.JOptionPane;

public class StringManipulator {

public static void dog(){



String userfavcity;

userfavcity = JOptionPane.showInputDialog("Please enter the name of your favorite city: ");


JOptionPane.showMessageDialog(null, " The number of characters in " + userfavcity + " is " + userfavcity.length());
JOptionPane.showMessageDialog(null, userfavcity + " converted to upper case is " + userfavcity.toUpperCase() );
JOptionPane.showMessageDialog(null, userfavcity + " converted to lower case is " + userfavcity.toLowerCase() );
JOptionPane.showMessageDialog(null, "The first character in " + userfavcity + " is " + userfavcity.charAt(0));}

public static void main (String[] args){
dog();
System.exit(0);
}}
