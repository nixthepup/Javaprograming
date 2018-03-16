public class personalInfoDemo
{
	public static void main(String[] args)
	{
		personalInfo josh = new personalInfo("josh", "105 churchview dirve jefferson city mo", 18, "54734692999");
		personalInfo Olvia = new personalInfo("Olvia", "jefferson city mo ", 15, "11889");
		personalInfo Nix = new personalInfo("Nix", "105 churchview dirve jefferson city mo", 17, "45975123");
		
		System.out.println("Person 1");
			System.out.println("Name: " + josh.getName());
			System.out.println("Address: " + josh.getAddress());
			System.out.println("Age: " + josh.getAge());
			System.out.println("Phone Number: " + josh.getPhoneNumb());
			
		System.out.println("Person 2");
			System.out.println("Name: " + Olvia.getName());
			System.out.println("Address: " + Olvia.getAddress());
			System.out.println("Age: " + Olvia.getAge());
			System.out.println("Phone Number: " + Olvia.getPhoneNumb());
			
		System.out.println("Person 3");
			System.out.println("Name: " + Nix.getName());
			System.out.println("Address: " + Nix.getAddress());
			System.out.println("Age: " + Nix.getAge());
			System.out.println("Phone Number: " + Nix.getPhoneNumb());
	}
}
