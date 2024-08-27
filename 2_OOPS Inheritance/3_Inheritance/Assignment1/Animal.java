package mypack;
class Animal1
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
	void sleep()
	{
		System.out.println("Animal is sleeping");
	}
}
class Bird extends Animal1
{
	void eat()
	{
		System.out.println("Bird is eating");
	}
	void sleep()
	{
		System.out.println("Bird is sleeping");
	}
	void fly()
	{
		System.out.println("Bird is flying");
	}
}
public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal1 a=new Animal1();
		Bird b=new Bird();
		a.sleep();
		b.fly();

	}

}
