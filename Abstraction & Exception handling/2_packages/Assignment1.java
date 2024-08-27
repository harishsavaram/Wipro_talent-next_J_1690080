package test_package;
class Foundation
{
	private int var1;
    int var2;
	protected int var3;
	public int var4;
}
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Foundation f=new Foundation();
       //f.var1=11;        // private modifier will rises error
       f.var2=24;
       f.var3=47;
       f.var4=54;
       //System.out.println(f.var1);                    //error produces
       System.out.println(f.var2);
       System.out.println(f.var3);
       System.out.println(f.var4);
	}

}
