package overriding;

class Shape1 {
    String name;
    Shape1()
    {
    	
    }
    Shape1(String n)
    {
    	this.name=n;
    }
    void draw()
    {
    	System.out.println("Drawing "+name);
    }
    void erase()
    {
    	System.out.println("Erasing "+name);
    }
}
class Circle extends Shape1
{
		Circle(String n)
		{
			super(n);
		}
}
class Triangle extends Shape1
{
	Triangle(String n)
	{
		super(n);
	}
}
class Square extends Shape1
{
	
	Square(String n)
	{
		super(n);
	}
}

    
public class Shape {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle("circle");
		Triangle t=new Triangle("Triangle");
		Square s=new Square("square");
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();
	}
}

