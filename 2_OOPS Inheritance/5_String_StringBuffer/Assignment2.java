package stringbuffer;
import java.util.*;
public class Assessment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		StringBuffer sb1=new StringBuffer(s.next());
		StringBuffer sb2=new StringBuffer(s.next());
		if(sb1.charAt(sb1.length()-1)==sb2.charAt(0))
		{
			sb2.delete(0,1);
		}
		sb1.append(sb2);
		System.out.println(sb1);
		s.close();
	}

}
