package wrapperclasses;
class Employee implements Cloneable
{
	String Name;
	Employee()
	{
		
	}
	Employee(String Name)
	{
		this.Name=Name;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public  Employee clone()
	{
		try {
			return (Employee) super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("Clonning is not allowed");
		}
		return this;
	}
}
public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Employee e=new Employee("sasidhar");
      Employee eclone=e.clone();
      System.out.println(e.getName());
      System.out.println(eclone.getName());
	}

}
