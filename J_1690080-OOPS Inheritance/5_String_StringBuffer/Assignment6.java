package stringbuffer;
import java.util.*;
public class Assessment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a=new String(s.next());
		String b=new String(s.next());
		String c;
		if(a.length()<b.length())
		{
			c=a+b+a;
		}
		else
		{
			c=b+a+b;
		}
		System.out.println(c);
s.close();
	}

}
