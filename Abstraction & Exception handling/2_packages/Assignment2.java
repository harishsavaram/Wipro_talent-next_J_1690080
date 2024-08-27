package packages;
 class Compartment
{
	double height;
	double width;
	double bredth;
	Compartment()
	{
		
	}
	Compartment(double height,double width,double bredth)
	{
		this.height=height;
		this.width=width;
		this.bredth=bredth;
	}
	void display()
	{
		System.out.println("COMPARTMENT: \n"+"\t"+"height: "+height+"\n"+"\t"+"width: "+width+"\n"+"\t"+"bredth: "+bredth);
	}
}
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment c=new Compartment(12.5,67.8,75.9);
		c.display();

	}

}
