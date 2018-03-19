public class RetailItemDemo
{
	public static void main(String[] args)
	{
		RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
		RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
		RetailItem item3 = new RetailItem("Shirt", 20, 24.95);
		
		System.out.println("Item 1");
			System.out.println("Description: " + item1.getDescription());
			System.out.println("Units on Hand: " + item1.getUnitsOnHand());
			System.out.println("Price: " + item1.getPrice());
			
		System.out.println("Item 2");
			System.out.println("Description: " + item2.getDescription());
			System.out.println("Units on Hand: " + item2.getUnitsOnHand());
			System.out.println("Price: " + item2.getPrice());
			
		System.out.println("Item 3");
			System.out.println("Description: " + item3.getDescription());
			System.out.println("Units on Hand: " + item3.getUnitsOnHand());
			System.out.println("Price: " + item3.getPrice());
	}
}
