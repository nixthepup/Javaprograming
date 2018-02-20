import javax.swing.JOptionPane;
import java.util.*;
public class dice4_21
{
	public static void dog()
	{
		Random random =new Random();
		int com;
		int user;
		int comtot =0;
		int usertot =0;
		String win = "nix";
		int i;
	for(i=0; i<10; i++){
		com = random.nextInt(9+1);
		user = random.nextInt(9+1);
		if ( com> user){
			comtot = comtot +1;
			JOptionPane.showMessageDialog(null,"User number:" +user+ "\n computer:" +com+ "\n the winner is  the computer");
		} else if (com<user){
			usertot = usertot +1;
			JOptionPane.showMessageDialog(null,"User number:" +user+ "\n computer:" +com+ "\n the winner is  the user");
		}else{
			JOptionPane.showMessageDialog(null,"User number:" +user+ "\n computer:" +com+ "\n its a tie!");
			win="tie";
		}
		
	}
		if (comtot > usertot){
			win ="Computer";}
	else if(comtot<usertot){
		win="user";}else {
			win="Tie";}
			JOptionPane.showMessageDialog(null,"The grand winner is the " + win);
	}
	public static void main(String[] args)
	{
		dog();
		System.exit(0);
	}
}
