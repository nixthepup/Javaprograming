
import javax.swing.JOptionPane;

public class RomanNumerals3_1{
	
	public static void dog(){
		
		//var
		int userNumber;
		String temp;
		//prompt for user to enter number
		
		temp = JOptionPane.showInputDialog("Enter a number 1-10");
		userNumber = Integer.parseInt(temp);
		
		if (userNumber == 1){JOptionPane.showMessageDialog(null,"I");
			} else if (userNumber == 2){JOptionPane.showMessageDialog(null,"II");
			} else if (userNumber == 3){JOptionPane.showMessageDialog(null,"III");
			} else if (userNumber == 4){JOptionPane.showMessageDialog(null,"IV");
			} else if (userNumber == 5){JOptionPane.showMessageDialog(null,"V");
			} else if (userNumber == 6){JOptionPane.showMessageDialog(null,"VI");
			} else if (userNumber == 7){JOptionPane.showMessageDialog(null,"VII");
			} else if (userNumber == 8){JOptionPane.showMessageDialog(null,"VIII");
			} else if (userNumber == 9){JOptionPane.showMessageDialog(null,"IX");
			} else if (userNumber == 10){JOptionPane.showMessageDialog(null,"X");
		    }else{ JOptionPane.showMessageDialog(null, "Must only enter 1-10 Only!", "Your A Failure!", JOptionPane.ERROR_MESSAGE);
				dog();}}
	
	public static void main (String[] args) {
		dog();
		System.exit(0);
	}
}

