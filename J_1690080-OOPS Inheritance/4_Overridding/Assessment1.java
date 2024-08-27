package overriding;
public class Fruit {
	String name;
	String taste;
	String size;
	Fruit()
	{
		
	}
	Fruit(String name,String taste,String size)
	{
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	void eat()
	{
		System.out.println("Name : "+name + " "+ "taste: "+taste );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit a=new Apple("Apple","Sweet","medium");
		Fruit o = new Orange("Orange","sour","medium");
		a.eat();
        o.eat();
	}
}
class Apple extends Fruit
{
	Apple(String name,String taste,String size)
	{
		super(name,taste,size);
	}
}
class Orange extends Fruit
{

	Orange(String name,String taste,String size)
	{
		super(name,taste,size);
	}
}
