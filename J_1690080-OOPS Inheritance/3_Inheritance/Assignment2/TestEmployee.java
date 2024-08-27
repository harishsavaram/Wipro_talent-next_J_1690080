package inheritance;

public class TestEmployee extends Employee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee("Harish",1000000,2025,"12345678");
		System.out.println(e.getYearOfStart());
        System.out.println(e.getName());
	}

}
