package stringbuffer;
import java.util.*;
public class Assessment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		StringBuffer sb=new StringBuffer(s.next());
		if(sb.length()%2==0)
		{
		
			String s1=sb.substring(0,sb.length()/2);
			System.out.println(s1);
		}
		else
		{
			System.out.println("null");
		}
     s.close();
	}

}
