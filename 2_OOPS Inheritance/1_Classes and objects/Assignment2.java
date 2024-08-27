package mypack;
class CalculatorDemo
{
	static int a;
	static int b;
	static double a1;
	static int b1;
	static void powerInt(int num1,int num2)
	{
		a=num1;
		b=num2;
		System.out.println(Math.pow(num1, num2));
	}
	static void powerDouble(double num1,int num2)
	{
		a1=num1;
		b1=num2;
		System.out.println(Math.pow(num1, num2));
	}
	
}
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorDemo cal=new CalculatorDemo();
		cal.powerInt(1, 2);
		cal.powerDouble(2,2);

	}

}
