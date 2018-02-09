import javax.swing.JOptionPane;
public class Hotel4_7{
	public static void dog(){
		String temp;
		int floors =0;
		int rooms = 9;
		int roomsused = 0;
		double totalrooms = 0;
		double totalroomsused = 0;
		double totalvacancy = 0;
		double usedrate =0.0;
		
		
		temp = JOptionPane.showInputDialog("Enter the number of floors");
		floors = Integer.parseInt(temp);
		
		// input valid check
		while(floors < 1){
		JOptionPane.showMessageDialog(null,"Invalid Input floor number must be greater than one");
		
		
		temp =	JOptionPane.showInputDialog("Enter the number of floors");
		floors = Integer.parseInt(temp);
		}
		
		for(int i=1; i<=floors; i++){
		temp =	JOptionPane.showInputDialog("Enter the number of rooms for the " + i + "th floor");
			rooms = Integer.parseInt(temp);
		while(rooms < 10){
			JOptionPane.showMessageDialog(null,"Invalid Input rooms must be greater than 9");
			temp =	JOptionPane.showInputDialog("Enter the number of rooms");
			rooms = Integer.parseInt(temp);
		}
		temp = JOptionPane.showInputDialog("Enter the number of rooms in use");
		roomsused = Integer.parseInt(temp);
		totalrooms = totalrooms + rooms;
		
		
		totalroomsused += roomsused;
		totalvacancy = totalrooms - totalroomsused;
		usedrate = (totalroomsused/totalrooms);
		
		}
		JOptionPane.showMessageDialog(null," Total Rooms:" + totalrooms + "\n Occupied:" +totalroomsused + " \n Vacant Rooms:" + totalvacancy+ "\n Occupancy Rate:" + String.format("%.2f",usedrate));
		
		
	}
	
	public static void main (String[] args){
		dog();
	System.exit(0);
	}
}
