import javax.swing.JOptionPane;
import java.util.*;
public class esp4_19{


public static void main(String[] args){
Random random =new Random();
int colorIndex;
int i;
String comcolor = "nix";
String userguessedColor;
int usercorrectguess = 0;

for(i=1; i< 10; ++i){
colorIndex = random.nextInt(5);
switch(colorIndex){
case 0:
comcolor = "Red";
break;

case 1:
comcolor="Green";
break;


case 2:
comcolor="Blue";
break;

case 3:
comcolor="Orange";
break;

case 4:
comcolor="Yellow";
break;

default:
JOptionPane.showMessageDialog(null,"The number " + colorIndex + " is not matched with a color!");
break;
}
userguessedColor = JOptionPane.showInputDialog("I have picked a color( Red,Green,Blue,Organe,Yellow) guess what it is:","Red");

if(userguessedColor.equalsIgnoreCase(comcolor)){
	usercorrectguess = usercorrectguess +1;
	JOptionPane.showMessageDialog(null,"You got it right good job \n the color was:" + comcolor);
}else{ JOptionPane.showMessageDialog(null,"You got it wrong nice try \n the color was:" + comcolor);}

}JOptionPane.showMessageDialog(null,"Game Over \n You got it right " + usercorrectguess + " number of times \n You played for " + i + " rounds");}}
