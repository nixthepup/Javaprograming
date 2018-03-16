public class personalInfo
{
	private String name;
	private String address;
	private int age;
	private String phoneNumber;
	
	public personalInfo(String n, String ad, int ag, String p)
	{
		name = n;
		address = ad;
		age = ag;
		phoneNumber = p;
	}

	public void setName(String n)
	{
		name = n;
	}

	public void setAddress(String ad)
	{
		address = ad;
	}

	public void setAge(int ag)
	{
		age = ag;
	}

	public void setPhoneNumb(String p)
	{
		phoneNumber = p;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getPhoneNumb()
	{
		return phoneNumber;
	}

}
