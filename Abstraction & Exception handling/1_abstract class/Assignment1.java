package abstractclass;

import java.util.Random;

abstract class Compartment
{
	public abstract void notice();
}
class Firstclass extends Compartment
{
	
	public void notice()
	{
		System.out.println("Notice: Your in First class");
	}
}
class Ladies extends Compartment
{
	public void notice()
	{
		System.out.println("Notice: Your in ladies class");
	}
}
class General extends Compartment
{
	public void notice()
	{
		System.out.println("Notice: Your in General class");
	}
}
class Luggage extends Compartment
{
	public void notice()
	{
		System.out.println("Notice: Your in Luggage class");
	}
}
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment[] compartments = new Compartment[10];

		Random rand = new Random();
		int randomNum=0;
	    for (int i = 0; i < 10; i++) {
	     randomNum = rand.nextInt((4 - 1) + 1) + 1;
	    
	    	if (randomNum == 1)
	    		compartments[i] = new Firstclass();
	    	else if (randomNum == 2)
	    		compartments[i] = new Ladies();
	    	else if (randomNum == 3)
	    		compartments[i] = new General();
	    	else if (randomNum == 4)
	    		compartments[i] = new Luggage();
	    	
	    	compartments[i].notice();
	    }
	}

}
