public class showChar5_1{
	
	 public static void main(String args[])
        {
            String myString="Nixie";
            showChar(myString,3);
        }
        static void showChar(String string, int charPosition)
        {
            char letter=string.charAt(charPosition);
            System.out.println("Character at position "+ charPosition +" : "+letter);
        }
    }
