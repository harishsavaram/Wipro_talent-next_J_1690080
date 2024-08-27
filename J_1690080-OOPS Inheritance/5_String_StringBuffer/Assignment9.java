package stringbuffer;
import java.util.*;
public class Assessment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a = s.next();
		String b = s.next();
		String bigger = a.length() > b.length() ? a : b;
		String smaller = a.length() < b.length() ? a : b;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < smaller.length(); i++) 
		{
			sb.append(a.charAt(i)).append(b.charAt(i));
		}		
		sb.append(bigger.substring(smaller.length(), bigger.length()));
		System.out.println(sb);
		s.close();
	}

}
