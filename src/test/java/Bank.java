
public class Bank {

	private String name;
	
	Bank(String name)
	{
		this.name=name;
	}
	
	
	public String getBanknname()
	{
		return name;
		
	}
	
public static void main(String[] args) {
	
	Bank  bank=new Bank("Axis");
	Employee emp=new Employee("jyoti");
	System.out.println(emp.getEmployeename()+ "is the employee of"+bank.getBanknname());
	
	
}

}
	
class Employee
{
	private String name;
	Employee (String name)
	{
		this.name=name;
	}
	
	public String getEmployeename()
	{
		return name;
	}
}

