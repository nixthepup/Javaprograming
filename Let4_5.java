import javax.swing.JOptionPane;

public class Let4_5
{
	public static void dog()
	{
	String sen = JOptionPane.showInputDialog("Enter a sentence");
	String character = JOptionPane.showInputDialog("Enter a character");
	char ch  = character.charAt(0);
	
	int len = sen.length() - 1;
	
	int accum = 0;
	for(int i = 0; i <= len; i++)
	{
		char letter = sen.charAt(i);
		if(letter == ch)
		{
			accum++;
		}
	}
	System.out.print(ch + " appears in " + "'" + sen + "' " + accum + " Time(s)");
	}
	
	public static void main(String[] args)
	{
		dog();
	}
}
