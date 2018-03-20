 import javax.swing.JOptionPane;
public class PayrollTest
{
	public static void main(String[] args)
	{
	Payroll employee = new Payroll();
	employee.setName(JOptionPane.showInputDialog("Input name"));
	employee.setIdNum(Integer.parseInt(JOptionPane.showInputDialog("Input ID number")));
	employee.setHourlyPay(Double.parseDouble(JOptionPane.showInputDialog("Input hourly pay")));
	employee.setHoursWorked(Double.parseDouble(JOptionPane.showInputDialog("Input hours worked")));
		
		System.out.println("Name: " + employee.getName());
		System.out.println("ID: " + employee.getIdNum());
		System.out.println("Hourly pay: $" + employee.getHourlyPay());
		System.out.println("Hours worked: " + employee.getHoursWorked());
		System.out.println("Gross pay: $" + employee.pay());
	}
}