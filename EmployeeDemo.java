public class EmployeeDemo
{
	public static void main(String[] args)
	{
		Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
		
		Employee employee2 = new Employee("Mark Jones", 39119);
			employee2.setDepartment("IT");
			employee2.setPosition("Programming");
			
		Employee employee3 = new Employee();
			employee3.setName("Joy Rogers");
			employee3.setIdNumber(81774);
			employee3.setDepartment("Manufacturing");
			employee3.setPosition("Engineer");
			
		System.out.println("Name: " + employee1.getName());
		System.out.println("ID: " + employee1.getidNumber());
		System.out.println("Department: " + employee1.getDepartment());
		System.out.println("Position: " + employee1.getPosition());
		
		System.out.println("Name: " + employee2.getName());
		System.out.println("ID: " + employee2.getidNumber());
		System.out.println("Department: " + employee2.getDepartment());
		System.out.println("Position: " + employee2.getPosition());
		
		System.out.println("Name: " + employee3.getName());
		System.out.println("ID: " + employee3.getidNumber());
		System.out.println("Department: " + employee3.getDepartment());
		System.out.println("Position: " + employee3.getPosition());
		
	}
}
